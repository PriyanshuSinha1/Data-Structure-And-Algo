package array;
import java.util.*;

public class ArrayOperation {
    public  ArrayAdt adt;
    public Scanner sc=new Scanner(System.in);
    
    public void createArray(){
        int i;
        System.out.println("Enter Array Size");
        int size=sc.nextInt();
        adt=new ArrayAdt(size);
    }
    public void insertData(int data){
        
        if(adt.lastindex==adt.capacity-1)
            System.out.println("Overflow\n" + "Insertion Not possible");
        
        else{
            adt.lastindex++;
            adt.arr[adt.lastindex]=data;
        }
    }
    
    public int linearSearch(ArrayAdt adt,int data){
        if(adt.lastindex==-1){
            System.out.println("Underflow");
        }
        else {
            for(int i=0;i<adt.arr.length;i++){
                if(adt.arr[i]==data){
                    System.out.println("Data is Match");
                    return i;
                }
            }
            
        }
        System.out.println("Data is Not found");
            return -1;
    }
    
    public void deletedItem(int data){
        if(adt.lastindex==-1){
            System.out.println("Underflow");
        }
        else{
            int a=1;
            
            boolean b=(linearSearch(adt,data)>=0);    // this function own class
            if(b){
                int temp;
                for(int i=linearSearch(adt,data) ; i<adt.lastindex ; i++){
                    adt.arr[i]=adt.arr[i+1];
                }
                adt.arr[adt.lastindex]=0;
                adt.lastindex--;
            }
        }
    }
    public void reverse(){
        if(adt.lastindex==-1)
            System.out.println("Reserve Impossible");
        
        else {
            for(int i=0;i<=(adt.lastindex+1)/2;i++){
                int temp=adt.arr[i];
                adt.arr[i]=adt.arr[adt.lastindex-i];
                adt.arr[adt.lastindex-i]=temp;
            }
        }
    }
    
    public void displayArray(){
        if(adt.lastindex==-1){
            System.out.println("Underflow");
            System.out.println("Data print not possible");
        }
        else{
            System.out.println("**************************************");
            
            for(int i=0;i<=adt.lastindex;i++){
                System.out.println(adt.arr[i]);
            }
            System.out.println("Array Size :"+ adt.arr.length);
           
        }
    }
    
}
