package linkedlist;
import java.util.Scanner;
//import stack.StackLinkedAdt;

class StackArray{
    int i=-1;    // No value
    StudentAdt []s=new StudentAdt[10];
}

public class StudentOperation {
    StackArray arr=new StackArray();
    public static StudentAdt start;
    public final static Scanner input=new Scanner(System.in);
    //public static  StackLinkedAdt stl=new StackLinkedAdt();
    
    public void insertData(int roll,String name,String Class){
        StudentAdt temp;
        temp=new StudentAdt();
        temp.roll=roll;
        temp.name=name;
        temp.Class=Class;
        
        if(start==null){
            start=temp;
            temp.next=null;
        }
        else {
            StudentAdt t=start;
            
            while(t.next!=null)
                t=t.next;
            t.next=temp;
            temp.next=null;
        }
    }
    
    
    public void viewData(){
        StudentAdt t=start;
        
        if(start==null)
            System.out.println("Data Empty");
        else {
        while(t.next!=null){
            System.out.print("Name :"+ t.name);
            System.out.print(" Roll "+t.roll);
            System.out.println(" Class "+t.Class);
            System.out.println();
            t=t.next;
        }
        System.out.print("Name :"+ t.name);
        System.out.print(" Roll "+t.roll);
        System.out.println(" Class "+t.Class);
            
        }
    }
  
    public static int menu(){
        System.out.println("\nPress 1 Insert Data");
        System.out.println("Press 2 View Data");
        System.out.println("Press 5 Exit Program");
        System.out.println("Press 6 Reverse Print");
        
        int choice =input.nextInt();
        return choice;
    }
    
    public void reversePrint(){
        if(start==null)
            System.out.println("data is empty");
        
        else {
            StudentAdt t=start;
            
            while(t.next!=null){
               // stl.push(t.roll,t.name,t.Class);  // Function Call
                stackarr(t);
                t=t.next;
            }
           // stl.push(t.roll,t.name,t.Class);  //  Function Call
            stackarr(t); // using array
            //stl.popDisplay();
            stackdisp(); // using array
        }
    }
    
    public void stackarr(StudentAdt add){
        if(arr.i>=11)
            System.out.println("overflow");
        else {
            arr.i++;
            arr.s[arr.i]=add;
        }
    }
    public void stackdisp(){
        if(arr.i==-1)
            System.out.println("UnderFlow");
        else {
            for(int x=arr.i;x>=0;x--){
                System.out.println(" Roll : " +arr.s[x].roll);
                System.out.println(" Name : " +arr.s[x].name);
                System.out.println(" Class : " +arr.s[x].Class);
            }
            arr.i=-1;
        }
    }
    
    public static void main(String[] args) {
        int roll=0;
        String Class=null,name=null;
        boolean flag=true;
        
        StudentOperation obj=new StudentOperation();
        
        while(flag){
            switch(menu()){
                case 1:
                    System.out.println("Enter a name");
                    input.nextLine();
                    name=input.nextLine();
                    System.out.println("Enter a Roll");
                    roll=input.nextInt();
                    System.out.println("Enter a Class");
                    input.nextLine();
                    Class=input.nextLine();
                    obj.insertData(roll, name, Class);
                    break;
                    
                case 2:
                    obj.viewData();
                    break;
                    
                case 5:
                    flag=false;
                    break;
                case 6:
                    obj.reversePrint();
                    break;
                    
                default:
                    System.out.println("Invaild Number");
                    break;
                    
            }
        }
       
    }
}
