package queue;
import java.util.Scanner;

public class QueueControaler {
    public final static Scanner scan=new Scanner(System.in);
    
    private static int menu(){
        System.out.println("\nPress 1 Create Queue Size");
        System.out.println("Press 2 Insert Rear");
        System.out.println("Press 3 Front Delete");
        System.out.println("Press 4 Display");
        System.out.println("Press 10 Exit Program");
        
        int choice=scan.nextInt();
        return choice;
    }
    
    public static void main(String[]args){
        int data;
        boolean flag=true;
        
        QueueOpertion q1=new QueueOpertion();
        
        while(flag){
            switch(menu()){
                
                case 1:
                    System.out.println("Enter Queue Size");
                    data=scan.nextInt();
                    q1.createQueue(data);
                    break;
                    
                case 2:
                    System.out.println("Enter a Data");
                    data=scan.nextInt();
                   // q1.rear(data);
                    break;
                    
                case 3:
                   // q1.front();
                    break;
                    
                case 4:
                   // q1.display();
                    break;
                    
                case 10:
                    flag=false;
                    break;
                    
                default:
                    System.out.println("Invaild Number");
                    break;
                    
            }
        }
    }
}
