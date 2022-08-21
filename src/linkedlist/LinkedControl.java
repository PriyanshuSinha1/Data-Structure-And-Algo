package linkedlist;
import java.util.Scanner;

public class LinkedControl {
    
    public static Scanner scan=new Scanner(System.in);
    int menu(){
            int choice;
            
            System.out.println("\nPress 1 Insert At First");
            System.out.println("Press 2 Insert At Last");
            System.out.println("Press 3 Delete At First");
            System.out.println("Press 4 Delete at last");
            System.out.println("Press 5 Display");
            System.out.println("Press 6 Total Node");
            System.out.println("Press 7 Sorting Node");
            System.out.println("Press 8 Sum of Number");
            System.out.println("Press 9 Delete Particular Data");
            System.out.println("Press 10 Shifting last Node");
            System.out.println("Press 11 Reverse Linked List");
            System.out.println("Press 12 Find Duplicate Value");
            System.out.println("Press 15 Exit Program");
           
            choice=scan.nextInt();
            return choice;
    }
    
    public static void main(String[]args){
        int data;
        boolean flag=true;
        
        // Singly Linked List control
        LinkedControl obj=new LinkedControl();
        
        LinkedListOperation l1=new LinkedListOperation();
       
        while(flag){
            switch(obj.menu()){
                case 1:System.out.println("Enter a Data");
                data=scan.nextInt();
                l1.insertAtfirst(data);
                break;
                
                case 2:System.out.println("Enter a Data");
                data=scan.nextInt();
                l1.insertAtEnd(data);
                break;
                
                case 3:l1.deletedAtFirst();
                break;
                
                case 4:l1.deletedAtLast();
                break;
                
                case 5:l1.displayList();
                break;
                
                case 6:
                    System.out.println(l1.countNode());
                    break;
                
                /*case 7:
                    l1.bubbleSort();
                    break;*/
                    
                case 8:
                    System.out.println(l1.sumOfNode());
                    break;
                
                case 9:
                    System.out.println("Delete a Data");
                    data=scan.nextInt();
                    l1.deleteParticularData(data);
                    break;
                
                case 10:
                    l1.shiftingLastNode();
                    break;
                
                case 11:
                    l1.reserveList();
                    break;
                
                case 12:
                    l1.findDuplicate();
                    break;
                    
                case 15:
                    flag=false;
                    break;
               
                default:
                    System.out.println("Invaild Number");
                    break;
                    
            }
        }


        // Doubly Linked List
        
        DoublyLinkedListOperation dl=new DoublyLinkedListOperation();
        
       /* while(flag){
            switch(obj.menu()){
                case 1:System.out.println("Enter a Data");
                data=scan.nextInt();
                dl.insertAtfirst(data);
                break;
                
                case 2:System.out.println("Enter a Data");
                data=scan.nextInt();
                dl.insertAtLast(data);
                break;
                
                case 3:dl.deleteAtFirst();
                break;
                
                case 4:dl.deleteAtLast();
                break;
                
                case 5:
                    dl.displayDoublyLinked();
                    break;
                
                case 6:
                    flag=false;
                    break; 
                    
                default:
                    System.out.println("Invaild Number");
                
            }
        }*/

    }
}
