package stack;
import linkedlist.*;

class StackLinked {
    int roll;
    String name;
    String Class;
   public StackLinked next;
   
}

public class StackLinkedAdt{
    public StackLinked start;
    
    public void push(int roll,String name,String Class){
        StackLinked temp;
        temp=new StackLinked();
        temp.roll=roll;
        temp.name=name;
        temp.Class=Class;
        
        if(start==null){
            start=temp;
            temp.next=null;
        }
        else {
            StackLinked t=start;
            start=temp;
            temp.next=t;
        }
    }
    
    public void popDisplay(){
        if(start==null)
            System.out.println("Data is Empty");
        else {
            StackLinked t=start;
            while(t.next!=null){
                
                System.out.print(" Roll : "+ t.roll);
                System.out.print(" Name : "+ t.name);
                System.out.println(" Class : "+ t.Class);
                t=t.next;
            }
            
            System.out.print(" Roll : "+ t.roll);
            System.out.print(" Name : "+ t.name);
            System.out.print(" Class : "+ t.Class);
            
            start=null;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Hello java");
    }
}
