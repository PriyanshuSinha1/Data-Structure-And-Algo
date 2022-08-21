package tree;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.*;

interface BinarySearchTree{
    public void insertion(int data);
    public void preOrder(BSTNode ptr);
    public void inOrder(BSTNode ptr);
    public void deleteion(int data);
    public void treeSearch(int data,BSTNode ptr);
    public void bfs(BSTNode r);
    public void dfs(BSTNode r);
}


public class TreeProgram implements BinarySearchTree{
     public static BSTNode root;
    
     @Override
    public void insertion(int data){
        BSTNode temp=new BSTNode();
        
        temp.item=data;
        temp.left=null;
        temp.right=null;
        
        if(root==null){
            root=temp;
        }
        
        else {
            BSTNode t=root;
            
            while(t!=null){
                
                if(t.item==data){
                    System.out.println("Duplicate Value is Not Allowed");
                    break;
                }
                else if(t.item<data){
                    
                    if(t.right==null){
                        t.right=temp;
                        break;
                    }
                    else 
                        t=t.right;
                }
                else {
                    if(t.left==null){
                        t.left=temp;
                        break;
                    }
                    else {
                        t=t.left;
                    }
                }
            }
        }
    }
     @Override
    public void preOrder(BSTNode ptr){
        if(ptr!=null){
            System.out.print(ptr.item + " ");
            preOrder(ptr.left);
            preOrder(ptr.right);
        }
    }
    public void inOrder(BSTNode ptr){
        if(ptr!=null){
            inOrder(ptr.left);
            System.out.print(ptr.item + " ");
            inOrder(ptr.right);
        }
    }
    
    public void deleteion(int data){
       
        if(root==null){
            System.out.println("UnderFlow");
        }
        else {
            BSTNode ptr,parptr=null;
            ptr=root;
            
            while(ptr!=null){
                
                if(ptr.item==data){
                    break;
                }
                else if(ptr.item<data){
                    parptr=ptr;
                    ptr=ptr.right;
                }
                else {
                    parptr=ptr;
                    ptr=ptr.left;
                }
            }
            if(ptr==null){
                System.out.println("Data is not found");
            }
            else{
                if(ptr.left==null && ptr.right==null){
                    delete0child(ptr,parptr);
                }
                
                else if(ptr.left==null || ptr.right==null){
                    delete1child(ptr,parptr);
                }
                
                else{
                    BSTNode pred,parpred;
                    parpred=ptr;
                    pred=ptr.left;
                    while(pred.right!=null){
                        parpred=pred;
                        pred=pred.right;
                    }
                    ptr.item=pred.item;
                    if(pred.left==null)
                        delete0child(pred,parpred);
                    else
                        delete1child(pred,parpred);
                }
            }
        }
    }
    private void delete0child(BSTNode ptr,BSTNode parptr){
        if(parptr==null){
            root=null;
        }
        else {
            if(parptr.left==ptr){
                parptr.left=null;
            }
            else {
             parptr.right=null;
            }
        }
    }
    private void delete1child(BSTNode ptr,BSTNode parptr){
        if(parptr==null){
            if(ptr.left!=null)
                root=ptr.left;
            else
                root=ptr.right;
        }
        else {
            if(ptr.left!=null){
                if(parptr.left==ptr){
                    parptr.left=ptr.left;
                }
                else{
                    parptr.right=ptr.left;
                }
            }
            else {
                if(parptr.right==ptr){
                    parptr.right=ptr.right;
                }
                else {
                    parptr.left=ptr.right;
                }
            }
        }
    }
    public static Scanner scan=new Scanner(System.in);
    
    private static int menu(){     
        System.out.println("\nPress 1 Insert ");
        System.out.println("Press 2 Deletion");
        System.out.println("Press 3 Search Data");
        System.out.println("Press 5 BFS ");
        System.out.println("Press 6 DFS ");
        System.out.println("Press 10Exit Program");
        
        int choice=scan.nextInt();
        return choice;
    }
    
    public void treeSearch(int data,BSTNode ptr){
        
        if(ptr!=null){
            if(ptr.item==data){
                System.out.println("Data is Found");
                return;
            }
            treeSearch(data,ptr.left);
            treeSearch(data,ptr.right);
        }
    } 
    
    public void bfs(BSTNode r){  //using Queue
        Queue <BSTNode>Q=new LinkedList();
        
        Q.offer(r);
        System.out.println("");
        while(Q.isEmpty()!=true){
            System.out.print(Q.peek().item +"  ");
            
            BSTNode temp=Q.poll();  // remove element
            if(temp.left!=null && temp.right!=null){
                Q.offer(temp.left);
                Q.offer(temp.right);
            }
            else if(temp.left!=null){
                Q.offer(temp.left);
            }
            else if(temp.right!=null)
                Q.offer(temp.right);
               
        }
        System.out.println();
    }
    
    public void dfs(BSTNode r){  //using Stack
        System.out.println("");
        Stack <BSTNode>stack=new Stack();
        
        stack.push(r);
        while(stack.empty()!=true){
            BSTNode temp=stack.pop();
            System.out.print(temp.item +"   ");
            
            if(temp.left!=null && temp.right!=null) {
                stack.push(temp.left);
                stack.push(temp.right);
            }
            else if(temp.left!=null)
                stack.push(temp.left);
            else if(temp.right!=null)
                stack.push(temp.right);
        }
        System.out.println();
    }
    
    
    public static void main(String[] args) {
        int data;
        boolean flag=true;
        
        // t1 ref var of tree interface
        BinarySearchTree t1=new TreeProgram();
        
        while(flag){
            t1.preOrder(root);
            System.out.println();
            t1.inOrder(root);
            
            switch(menu()){
                case 1:
                    System.out.println("Enter A Data");
                    data=scan.nextInt();
                    t1.insertion(data);
                    break;
                
                case 2:
                    System.out.println("Enter delete data");
                    data=scan.nextInt();
                    t1.deleteion(data);
                    break;
                
                case 3:
                    System.out.println("Enter Search  Data");
                    data=scan.nextInt();
                    t1.treeSearch(data, root);
                    break;
                   
                case 5:
                    t1.bfs(root);
                    break;
                    
                case 6:
                    t1.dfs(root);
                    break;
                case 10:
                    flag=false;
                    break;
                
                default:
                    System.out.println("Invaild Number");
                    
            }
        }
        
    }

}
