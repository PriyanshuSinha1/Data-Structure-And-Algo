package sorting;

public class InsertionSort {
    
    public void insertion(int arr[]){
        
        int i,j,temp;
        for(i=1;i<arr.length;i++){
            temp=arr[i];  //reverse value
            j=i-1;
    
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
    
    public void insertion1(int arr[])
    {
        for(int i=1;i<arr.length;i++) 
        {
            int temp=arr[i];
            int j=i-1;
            for(j=i-1;j>=0;j--)
            {
                if(arr[j]>temp)
                    arr[j+1]=arr[j];
                else 
                    break;
            }
            arr[j+1]=temp;
        }
    }
    public void displayInsertion(int arr[]){
        System.out.println("");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +"  ");
        }
    }
    
    public static void main(String[] args) {
        int arr[]={50,20,10,80,60,90,70,100,40,30};
        
        InsertionSort sort=new InsertionSort();
        
        sort.displayInsertion(arr);
        sort.insertion1(arr);
        sort.displayInsertion(arr);
    }

}
