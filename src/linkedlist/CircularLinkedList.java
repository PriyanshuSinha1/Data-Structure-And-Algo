package linkedlist;

public class CircularLinkedList {
    CircularNode start;
    int sum;
    public void insertAtLast(int data){
        CircularNode temp;
        temp=new CircularNode();
        temp.item=data;
        
        if(start==null){
            start=temp;
            temp.next=start;
        }
        
        else {
            CircularNode t=start;
            while(start!=t.next){
                t=t.next;
            }
            t.next=temp;
            temp.next=start;
            System.out.println("Data successful insert");
        }
    }
    
    public int sumofNode(){
        sum=0;
        CircularNode t=start;
        
        if(start==null){
            System.out.println("Underflow");
            return 0;
        }
        else{
            while(t.next!=start){
                sum=sum+t.item;
                t=t.next;
            }
            sum=sum+t.item;
            return sum;
        }
    }
    
    public void insertAtfirst(int data){
        CircularNode temp;
        temp=new CircularNode();
        temp.item=data;
        
        if(start==null){
            start=temp;
            temp.next=start;
        }
        else{
            CircularNode trav=start,rev=start;
            
            while(start!=trav.next){
                trav=trav.next;
            }
            trav.next=temp;
            
            start=temp;
            temp.next=rev;
        }
    }
    
    public void deleteAtFirst(){
        try{
             CircularNode rev=start.next,trav=start;
        
        
         if(start==null){
             System.out.println("Data Empty");
         }
         else if(start==rev){
             start=null;
             System.out.println("Deleted Successful");
         }
         else {    
            while(start!=trav.next){
                trav=trav.next;
            }
            trav.next=rev;
            start=rev;
            System.out.println("Deleted Successful");
            }
        }
        catch(NullPointerException e){
            System.out.println("Data Empty");
        }
    }
    
    public void deleteAtLast(){
        try{
            CircularNode trv=start,rev=null;
            CircularNode Lst=start.next;
        
        if(start==null){
            System.out.println("UnderFlow");
        }
        
        else if(start==Lst){
            start=null;
            System.out.println("Delete SuccessFul");
        }
                
        else {
            while(start!=trv.next){
                rev=trv;
                trv=trv.next;
            }
            rev.next=start;
            System.out.println("Deleted Successful");
        }
        }
        catch(NullPointerException e){
            System.out.println("data Empty");
        }
    }
    
    public void displayList(){
        CircularNode trav=start;
        
        if(start==null){
            System.out.println("UnderFlow");
        }
        else {
           
            while(start!=trav.next){
                System.out.print(trav.item + " ");
                trav=trav.next;
            }
            System.out.print(trav.item + " ");
        }
    }
       
}
