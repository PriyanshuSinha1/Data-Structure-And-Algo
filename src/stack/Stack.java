package stack;

public class Stack {
       
    public int capacity;
    public int Top;
    public int arr[];
    
    public Stack(int cap){
        capacity=cap;
        Top=-1;
        arr=new int[cap];
    }
}

