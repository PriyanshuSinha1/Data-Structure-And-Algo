package array;

public class DynamicArray {
     private DynamicAdt dar;
     
    public void createArray(int cap){
        dar=new DynamicAdt();   //object create to dynamic array ADT
        
        dar.capacity=cap;
        dar.lastindex=-1;
        dar.arr=new int[cap];   //Array Create
        System.out.println("SuccessFul Create");
    }
    
    private void doubleSizeArray(){
        int temp[]=new int[(dar.capacity)];
        
        for(int i=0;i<=dar.lastindex;i++){ 
            temp[i]=dar.arr[i];       // Old array Data copy
        }
        
        dar.arr=new int[(dar.capacity*2)];     // new Array Flexible
        dar.capacity=dar.capacity*2;            // Change capacity value
        
        for(int i=0;i<=dar.lastindex;i++){
            dar.arr[i]=temp[i];
        }
    }
    
    public void insert(int data){
        try{
        if(dar.lastindex==dar.capacity-1){
           doubleSizeArray();
           System.out.println("SuccessFul Size Flexible");
        }
        
        dar.lastindex++;
        dar.arr[dar.lastindex]=data;
        }
        catch(NullPointerException obj){
            System.out.println("Size Not Declared ");
            System.out.println("Please Size Declared\nTry Again ... ");
        }
        
    }
    
    public void displayData(){
        if(dar.lastindex==-1)
            System.out.println("Data Empty");
        
        else{
            for(int i=0;i<=dar.lastindex;i++){
                System.out.print(dar.arr[i] + " ");
            }
            System.out.println("\nTotal Array Size is :"+dar.arr.length +" And Capacity :"+dar.capacity);
        }
    }
    
}
