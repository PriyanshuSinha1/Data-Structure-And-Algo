package linkedlist;
import java.util.*;

public class CircularControl {
    public static Scanner scan=new Scanner(System.in);
    int menu(){
            int choice;
            
            System.out.println("\nPress 1 Insert At First");
            System.out.println("Press 2 Insert At Last");
            System.out.println("Press 3 Delete At First");
            System.out.println("Press 4 Delete at last");
            System.out.println("Press 5 Display");
            System.out.println("Press 6 sum of Number");
            System.out.println("Press 7 Exit Program");
            
            choice=scan.nextInt();
            return choice;
    }
    
    public static void main(String[]args){
        int data;
        boolean flag=true;
        CircularControl cc=new CircularControl();
        CircularLinkedList CLL=new CircularLinkedList();
        
        while(flag){
            switch(cc.menu()){
                case 1:
                    System.out.println("Enter a Data");
                    data=scan.nextInt();
                    CLL.insertAtfirst(data);
                    break;
                 
                case 2:
                    System.out.println("Enter a Data");
                    data=scan.nextInt();
                    CLL.insertAtLast(data);
                    break;
                
                case 3:
                    CLL.deleteAtFirst();
                    break;
                    
                case 4:
                    CLL.deleteAtLast();
                    break;
                    
                case 5:
                    CLL.displayList();
                    break;
                
                case 6:
                    System.out.println(CLL.sumofNode());
                    break;
                    
                case 7:
                    flag=false;
                    break;
                    
                default:
                    System.out.println("Invaild Number");
                    break;
                    
           }
        }
    }
    
}
