package sorting;

public class SelectionSort {
    private int i,j;
    
    public void selection(int arr[]){
        
        for(i=0;i<arr.length;i++){
            for(j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp;
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    // swaping completed
                }
            }
        }
    }
    
    public void selectionStr(String []str){
        for(i=0;i<str.length;i++){
            for(j=i+1;j<str.length;j++){
                if(str[i].compareTo(str[j])>0){
                    String temp;
                    temp=str[i];
                    str[i]=str[j];
                    str[j]=temp;
                    // String swaping completed
                }
            }
        }
    }
    
    public void displayStr(String[]str){
        for(i=0;i<str.length;i++){
            System.out.println(str[i]);
        }
    }
    
    public void displaySelectionSort(int arr[]){
      int i;
      
      for(i=0;i<arr.length;i++){
          System.out.print(arr[i] +" ");
      }
  }
}
