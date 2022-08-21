package tree;

public class TreeDeleteion extends TreeInsertion {
    
    public void deletion(int data){  
         BSTNode root=super.root;  // Main Root varaible Original data copy
         
         if(super.root==null){   //root checking
            System.out.println("UnderFlow");
        }
         
        else {
            BSTNode ptr,parptr;
            
            ptr=root;
            parptr=null;
            
            while(ptr!=null){
                if(ptr.item==data)
                    break;
                
                if(data<ptr.item){
                    parptr=ptr;
                    ptr=ptr.left;
                }
                else{
                    parptr=ptr;
                    ptr=ptr.right;
                }
            }
            if(ptr==null){   // ptr mean Data Searching Result:
                System.out.println("Data Not Found");
            }
            else{
                if(ptr.left==null && ptr.right==null)
                    delete0Child(ptr,parptr);
                
                else if(ptr.left==null || ptr.right==null)
                    delete1Child(ptr,parptr);   
                
                else {
                    BSTNode pred,parpred;  // pred mean just node And parpred mean parent node
                    
                    parpred =ptr;   // ptr mean present data delete
                    pred=ptr.left;
                    
                    while(pred.right!=null){
                        parpred=pred;
                        pred=pred.right;
                    }
                    ptr.item=pred.item;   //Replace Data
                    
                    if(pred.left!=null)
                        delete1Child(pred,parpred);   // Call function
                    
                    else {
                        delete0Child(pred,parpred);   // Call Function
                    }
                }
            }
        }
    }
    
    private void delete0Child(BSTNode ptr,BSTNode parptr){
        
        if(parptr==null){
            System.out.println("sefty del. no child");
            super.root=null;
        }
        else {
            if(ptr==parptr.left){
                parptr.left=null;
            }
            else{
                parptr.right=null;
            }
        }
        
    }
    
    private void delete1Child(BSTNode ptr,BSTNode parptr){
        
        if(parptr==null){
            if(ptr.left!=null){
               super.root=ptr.left;
                System.out.println("ok del. 1 Left child");
            }
            else {
                System.out.println("ok del. 1 Right child");
                super.root=ptr.right;   //Doubt
            }
        }
        
        else {
            if(ptr==parptr.left){
                if(ptr.left!=null)
                    parptr.left=ptr.left;
                else {
                    parptr.left=ptr.right;
                }
            }
            else{
                 if(ptr.left!=null)
                    parptr.right=ptr.left;
                else {
                    parptr.right=ptr.right;
                }
            }
        }
    }
}
