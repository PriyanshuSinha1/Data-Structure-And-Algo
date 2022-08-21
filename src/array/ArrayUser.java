package array;
import java.util.*;

public class ArrayUser {
    private static ArrayOperation op=new ArrayOperation();
    Scanner scan=new Scanner(System.in);
    
    int menu(){
            int choice;
            System.out.println("\nPress 1 Create Array Size");
            System.out.println("Press 2 Insert Data");
            System.out.println("Press 3 Delete Data");
            System.out.println("Press 4 Display Data");
            System.out.println("Press 5 Reverse");
            System.out.println("Press 10 Exit Program");
            choice=scan.nextInt();
            return choice;
    }
    public static void main(String []args){
      
        boolean flag=true;
        Scanner sc=new Scanner(System.in);
        ArrayUser au=new ArrayUser();
        int data;
        
        while(flag){
            switch(au.menu()){
                
                case 1:op.createArray();
                    break;
                    
                case 2:System.out.println("Enter A Data");
                    data=sc.nextInt();
                    op.insertData(data);
                    break;
                    
                case 3:System.out.println("Enter A Data");
                    data=sc.nextInt();
                    op.deletedItem(data);
                    break;
                case 4:op.displayArray();
                    break;
                
                case 5:
                    op.reverse();
                    break;
                    
                case 10: flag=false;
                        break;
                    
                default:System.out.println("Invaild Number");
            }
        }
        
    }
    
}
