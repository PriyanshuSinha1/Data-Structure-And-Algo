package tree;
import java.util.*;

public class TreeControl {
    public static Scanner scan=new Scanner(System.in);
        
        int menu(){
            
            System.out.println("Press 1 Insert ");
            System.out.println("Press 2 Deletion");
            System.out.println("Press 5 Total Edge");
            System.out.println("Press 7 height max");
            System.out.println("Press 10Exit Program");
            int choice=scan.nextInt();
            return choice;
    }
        
    public static void main(String []args){
        int data;
        boolean flag=true;
        TreeControl tc=new TreeControl();
        
        TreeInsertion t1=new TreeInsertion();
        Travelsing tv=new Travelsing();
        TreeDeleteion TD=new TreeDeleteion();
        
        while(flag){
            System.out.println("*****************************");
            System.out.println(""+"\nPreOrder");
            tv.preOrder(t1.root);
            System.out.println(""+"\nInOrder");
            tv.inOrder(t1.root);
            System.out.println(""+ "\nPostOrder");
            tv.postOrder(t1.root);
            System.out.println("\n*****************************");
            
            switch(tc.menu()){
                
                case 1:
                    System.out.println("Enter a Data");
                    data=scan.nextInt();
                    t1.insertion(data);
                    break;
                    
                case 2:
                    System.out.println("Enter Deletion Data");
                    data=scan.nextInt();
                    TD.deletion(data);
                    break;
                 
                case 5:
                    tv.printedge(t1.root);
                    break;
                    
                case 7:
                    System.out.println(t1.heightMax(t1.root));
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
