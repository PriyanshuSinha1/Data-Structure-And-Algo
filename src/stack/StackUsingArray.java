package stack;
// Stack principal Last In First Out

public class StackUsingArray {
    Stack adt;   // reference variable
    
    public void createStack(int size){
        adt=new Stack(size);
        System.out.println("SuccessFul Stack Create");
    }
    
    public void push(int data){
        try{
        if(adt.Top==adt.capacity-1)
            System.out.println("Stack OverFlow");
        
        else {
            adt.Top++;
            adt.arr[adt.Top]=data;
            System.out.println("Insert SuccessFul");
        }
        }
        catch(NullPointerException obj){
            System.out.println("Please Create Stack Size");
        }
    }
    public void pop(){
        if(adt.Top==-1){
            System.out.println("UnderFlow");
        }
        else {
            adt.arr[adt.Top]=0;
            adt.Top--;
            System.out.println("Delete SuccessFul");
        }
    }
    
    public int top(){
        if(adt.Top==-1){
            return -1;
        }
        else {
            return adt.arr[adt.Top];
        }
    }
    
    public void displayStack(){
        if(adt.Top==-1){
            System.out.println("UnderFlow");
        }
        else{
            int i=0;
            while(i<=adt.Top){
                System.out.println(adt.arr[i]);
                i=i+1;
            }
        }
    }    
}
