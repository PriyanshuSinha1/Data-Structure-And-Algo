package array;

public class ArrayAdt {
    public int capacity;
    public int lastindex;
    public int arr[];
    
    public ArrayAdt(int cap){
        capacity=cap;
        lastindex=-1;
        arr=new int[cap];
    }
}
