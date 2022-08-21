package stack;

class Node{
    public int item;
    public Node next;
}

class StackOperation{
    public Node Top;
    
    public void push(int data){
        Node temp;
        temp=new Node();
        temp.item=data;
        
        if(Top==null){
            Top=temp;
            temp.next=null;
        }
        else {
            Node t=Top;
            Top=temp;
            temp.next=t;
        }
    }
    
    public void pop(){
        if(Top==null)
            System.out.println("Underflow");
        else{
          Top=Top.next;
          System.out.println("Delete SuccessFul");
        }
    }
    public void display(){
        Node trav=Top;
        
        if(trav==null){
            System.out.println("UnderFlow");
        }
        else {
            System.out.println();
            while(trav.next!=null){
                System.out.println(trav.item);
                trav=trav.next;
            }
            System.out.println(trav.item);
        }
    }
 
}
public class StackUsingLinkedlist {
    public static void main(String[] args){
        StackOperation so=new StackOperation();
        so.push(50);
        so.push(60);
        so.push(70);
        so.push(80);
        so.push(90);
        so.display();
        so.pop();
        so.display();
    }
}
