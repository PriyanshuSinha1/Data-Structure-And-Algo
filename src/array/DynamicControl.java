package array;
import java.util.*;

public class DynamicControl {
    public final static Scanner sc=new Scanner(System.in);
    
    int menu(){
      int choice ;
      
      System.out.println("\nPress 1 Create Array");
      System.out.println("Press 2 Insert Data");
      System.out.println("Press 3 DisPlay Data");
      System.out.println("Press 10 Exit");
      
      choice=sc.nextInt();
      return choice;
    }
    
    public static void main(String []Args){
        int data ;
        boolean flag=true;
        
        DynamicControl DC = new DynamicControl();
        DynamicArray op=new DynamicArray();
        
        while(flag){
            switch(DC.menu()){
                case 1:
                    System.out.println("Enter Array Size");
                    data =sc.nextInt();
                    op.createArray(data);
                    break;
                    
                case 2:
                    System.out.println("Enter Data");
                    data =sc.nextInt();
                    op.insert(data);
                    break;
                    
                case 3:
                    op.displayData();
                    break;
                    
                case 10:
                    flag=false;
                    break;
                    
                default:
                    System.out.println("Invaild Number ");
                    break;
                    
            }
        }
    }
}
