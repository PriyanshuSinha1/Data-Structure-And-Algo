package sorting;

public class MergeSort {
    private static int arr[]={50,20,80,40,90,100,30,10,70,60};
    
    public void mergeSort(int arr[],int l,int r) {
        
        if(l<r) {
            int mid=(l+r)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            
            mergeArray(arr,l,mid,r);
        }
    }
    private void mergeArray(int arr[],int l,int mid,int u)  {
        
        int br[]=new int[u+1];
        
        int i=l;
        int j=mid+1;
        int k=l;
        
        while(i<=mid && j<=u) {
           if(arr[i]<arr[j]){
               br[k]=arr[i];
               i++;k++;
           }
           else {
               br[k]=arr[j];
               k++;j++;
           }
        }
    
        while(i<=mid){   // check left array is remaing or not
            br[k]=arr[i];
            i++;k++;
        }
        
        while(j<=u){   // check Right array is remaing or not
            br[k]=arr[j];
            k++;j++;
        }

        for(k=l;k<=u;k++)
            arr[k]=br[k];
        
    } 
    
    private void mergeArrays(int arr[],int l,int mid,int u) {
        int left[]=new int[mid-l+1];
        int right[]=new int[u-mid];
        
        for(int i=0;i<mid-l+1;i++) // copy array
            left[i]=arr[l+i];
        
        for(int j=0;j<u-mid ;j++) // copy array
            right[j]=arr[mid+1+j];
        
        int i=0;int j=0; int k=l;
        
        while(i<mid-l+1 && j<u-mid){
            
            if(left[i]<right[j]) {
                arr[k]=left[i];
                k++; i++;
            }
            else 
            {
                arr[k]=right[j];
                j++;k++;
            }
        }
        
        while(i<mid-l+1){
            arr[k]=left[i];
            i++;k++;
        }
        while(j<u-mid) {
            arr[k]=right[j];
            j++;k++;
        }
    }
    
    public static void main(String[] args) {
        MergeSort m=new MergeSort();
        
        for (int k : arr)
            System.out.print(k +"   ");
        
        m.mergeSort(arr, 0, 9);
        System.out.println("\n********************************************");
        
        for (int k : arr)
            System.out.print(k +"   ");

      
    }
}
