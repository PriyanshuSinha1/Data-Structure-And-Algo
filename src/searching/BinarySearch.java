package searching;

public class BinarySearch {
    private int low,max,mid;
    
    public int binarySearch(int arr[],int data){
        low=0;
        max=arr.length-1;
        
        while(low<=max){
            mid=(low+max)/2;
            
            if(arr[mid]==data){
                System.out.println("\nThis Number is Available");
                return mid;
            }
            else if(arr[mid]<data){
                low=mid+1;
            }
            else
                max=mid-1;  
        }
        
        if(low>max){
            System.out.println("\nThis Number is Not Available");
            return -1;
        }
        return -1;
    }
        
    public static void main(String[] args) {
        BinarySearch b=new BinarySearch();
        
        int arr[]={1,2,4,5,6,11,12};
        b.binarySearch(arr, 6);
    }
}
