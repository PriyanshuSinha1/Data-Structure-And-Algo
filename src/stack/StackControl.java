package stack;
import java.util.Scanner;

public class StackControl {
     public static final Scanner input=new Scanner(System.in);
    
    public static int menu(){
        System.out.println("\nPress 1 Stack Create");
        System.out.println("Press 2 Push Data");
        System.out.println("Press 3 Pop Data");
        System.out.println("Press 4 Top Value");
        System.out.println("Press 5 Display Stack");
        System.out.println("Press 10 Exit");
        
        int choice =input.nextInt();
        return choice;
    }
    
    public static void main(String[]args){
        boolean flag=true;
        int data;
        StackUsingArray stack=new StackUsingArray();
        
        while(flag){
            switch(menu()){
                case 1:
                    System.out.println("Enter a Stack Size");
                    data=input.nextInt();
                    stack.createStack(data);
                    break;
                    
                case 2:
                    System.out.println("Enter a Data");
                    data=input.nextInt();
                    stack.push(data);
                    break;
                    
                case 3:
                    stack.pop();
                    break;
                    
                case 4:
                    try{
                        System.out.println(stack.top());
                    }
                    catch(ArrayIndexOutOfBoundsException e){
                        System.out.println("Underflow");
                    }
                    break;
                    
                case 5:
                    stack.displayStack();
                    break;
                    
                case 10:
                    flag=false;
                    break;
                    
                default:
                    System.out.println("Invaild Number");
                    
            }
        }
        
    }
}
