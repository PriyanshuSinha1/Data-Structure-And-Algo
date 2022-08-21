package array;

public class RotateArray {
    private int arr[]={1,2,3,4,5,6,7,8};
    
    public void reservedArray(){
        
        for(int i=0; i< (arr.length)/2 ;i++){
            int temp=arr[i];
            arr[i]=arr[(arr.length-1)-i];
            arr[(arr.length-1)-i]=temp;
        }
        
    }
    
    public void shifingArray(int ro){   //shifing clockwise
        int i;
        
        for(int chance=1;chance<=ro;chance++){
            int s=arr[arr.length-1];
            
            for(i=arr.length-1;i>0;i--){
                arr[i]=arr[i-1];
            }
            arr[i]=s;
            System.out.println("Shifing Completed");
        }
    } 
    public void shifing(int ro){   //shifing anti clockwise
        int i;
        
        for(int chan=1;chan<=ro;chan++){
            int s=arr[0];
            for(i=0;i<arr.length-1;i++){
                arr[i]=arr[i+1];
            }
            arr[arr.length-1]=s;
            System.out.println("Shifing completed");
        }
    }
    
    public void display(){
        for(int k:arr){
            System.out.print(k +" ");
        }
        System.out.println("");
    }
    
    public static void main(String[]args){
        RotateArray r1=new RotateArray();
        
        r1.display();
        //r1.shifingArray(0);
        //r1.shifing(2);
        r1.reservedArray();
        r1.display();
    }
}
