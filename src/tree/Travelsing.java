package tree;
        
public class Travelsing {
    
    public void preOrder(BSTNode root){
        if(null!=root){
            
            System.out.print(root.item + " ");
            preOrder(root.left);
            preOrder(root.right);
            
        }
    }
    public void inOrder(BSTNode root){
        if(null!=root){
            inOrder(root.left);
            System.out.print(root.item + " ");
            inOrder(root.right);

        }
    }
    public void postOrder(BSTNode root){
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.item + " ");
        }
    }
    
    private int edge=0;
    public void findEdge(BSTNode root) {
        if(root!=null) {
            edge++;
            findEdge(root.left);
            findEdge(root.right);
        }
    }
    public void printedge(BSTNode root){
        edge=0;
        findEdge(root);
        System.out.println("Total Edge :" +edge);
    }
    
}
