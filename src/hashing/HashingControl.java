package hashing;
import java.util.Scanner;

public class HashingControl {
    public static final Scanner input=new Scanner(System.in);
    
    private static int menu(){
        System.out.println("\nPress 1 Student Size");
        System.out.println("Press 2 Insert Student Data");
        System.out.println("Press 3 Search Data");
        System.out.println("Press 4 Exit Program");
        
        int choice =input.nextInt();
        return choice;
        
    }
    
    public static void main(String[]args){
        int data;
        int r,c,size,si;
        String n;
        boolean flag=true;
        HashingOpertion HS=new HashingOpertion();
        
        while(flag){
            switch(menu()){
                case 1:
                    System.out.println("Enter a Student Size");
                    size=input.nextInt();
                    System.out.println("Enter Roll Size");
                    si=input.nextInt();
                    HS.createStudentSize(size, si);
                    break;
                    
                case 2:
                    System.out.println("Enter Roll Number");
                    r=input.nextInt();
                    System.out.println("Enter Name");
                    input.next();
                    n=input.nextLine();
                    System.out.println("Enter a Class");
                    c=input.nextInt();
                    HS.insertionData(r, n, c);
                    break;
                    
                case 3:
                    System.out.println("Enter Roll Number");
                    r=input.nextInt();
                    HS.hasingSearching(r);
                    break;
                    
                case 4:
                    flag=false;
                    break;
                    
                default:
                    System.out.println("Invaild Number");
                    break;
                    
            }
        }
    }
}
