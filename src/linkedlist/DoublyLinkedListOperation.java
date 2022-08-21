package linkedlist;


public class DoublyLinkedListOperation {
    private DoublyNode start;
    
    public void insertAtfirst(int data){
        DoublyNode temp;
        temp=new DoublyNode();
        
        temp.Item=data;
        temp.prev=null;
        
        if(start==null){
            start=temp;
            temp.next=null;
        }
        else {
            DoublyNode t=start;
           start=temp;
           temp.next=t;
           t.prev=temp;
        }
        
    }
    
    public void insertAtLast(int data){
        DoublyNode temp;
        temp=new DoublyNode();
        
        temp.Item=data;
        
        if(start==null){
            start=temp;
            temp.next=null;
            temp.prev=null;
        }
        else {
            DoublyNode t=start;
            
            while(null!=t.next){
                t=t.next;
            }
            t.next=temp;
            temp.prev=t;
            temp.next=null;
        }
    }
    public void deleteAtFirst(){
        if(start==null){
            System.out.println("Deleted not possible");
        }
        else{
            DoublyNode t;
            t=start.next;
            start=t;
            t.prev=null;
            System.out.println("Delete SuccessFul");
        }
    }
    
    public void deleteAtLast(){
        if(start==null){
            System.out.println("Delete Not possible");
        }
        else {
            DoublyNode t,p=null;
            t=start;
            
            while(null!=t.next){
                p=t;
                t=t.next;
            }
            p.next=null;
            System.out.println("Delete SuccessFul");
            
        }
    }
    
   public void displayDoublyLinked(){
       if(start==null){
           System.out.println("List Empty");
       }
       else{
           DoublyNode t=start;
           while(null!=t.next){
               System.out.print(t.Item + " ");
               t=t.next;
           }
           System.out.print(t.Item + " ");
       }
   }
   
}
