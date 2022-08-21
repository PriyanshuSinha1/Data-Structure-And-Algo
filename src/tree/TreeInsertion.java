package tree;
// Binary Search Tree (BST)

public class TreeInsertion {
    public static BSTNode root=null;    // Main Variable
    
    public void insertion(int data) {
        BSTNode temp;
        temp=new BSTNode();
        temp.item=data;
        temp.left=null;
        temp.right=null;  // newnode complete
        
        if(root==null){
            root=temp;
        }
        
        else{
            BSTNode t=root;
            while(t!=null){
                
                if(t.item==data){
                    System.out.println("Duplicate Value is Not Allowed");
                    break;
                }
                else if(data>t.item){  //right subtree
                   if(t.right==null){
                       t.right=temp;
                       break;
                    }
                   else{
                       t=t.right;
                   }

                }
                else{  //left subtree
                    if(t.left==null){
                        t.left=temp;
                         break ;
                    }
                    else{
                            t=t.left;
                        }
                    }
                }
        }
        
    }
    
    public int heightMax(BSTNode root){
        if(root==null)
            return 0;
        
        return 1+Math.max(heightMax(root.left), heightMax(root.right));
    }
    
}
  
