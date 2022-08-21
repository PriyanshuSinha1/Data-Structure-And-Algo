package sorting;

public class QuickSort {
    private static int arr[]={50,20,80,40,90,100,30,10,70,60};
    //private static int arr[]={1,3,4,5,1};
    
    
    public void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
    public void quick(int arr[],int l,int u) //This technique is divide and conque
    {
        if(l<u)
        {
            int pivot=quickProcissor(arr,l,u);
            quick(arr,l,pivot-1);
            quick(arr,pivot+1,u);
        }
    }
    public int quickProcissor(int arr[],int left,int right)
    {
        int pivot=left;  // this pivot element set a real postion of array
        
        while(left<right) {
            
            while(left<right && arr[pivot] <= arr[right])
                right--;
            if(left==right)
                break;
            swap(arr,pivot,right);
            pivot=right;
            
            while(left<right && arr[left] <= arr[pivot])
                left++;
            if(left==right)
                break;
            swap(arr,left,pivot);
            pivot=left;
            
        }
        return pivot;
    }
    
    public void display(int arr[])
    {
        System.out.println("");
        
        for(int k :arr)
            System.out.print(k +" ");
    }
    
    public static void main(String[] args) {
       QuickSort q=new QuickSort();
       
       q.display(arr);
       q.quick(arr, 0, arr.length-1);
       q.display(arr);
    }
}
