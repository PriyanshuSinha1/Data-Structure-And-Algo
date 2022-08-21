package sorting;

public class BubbleSort {
    private int i,j;
    
    private static int arr[]={50,40,20,60,90,70,30,10};   // 8
    
    
    public void sorting() {
       // Bubble Sorting 
       
       for(int i=1;i<=arr.length-1 ;i++){
           
           for(int j=0;j<arr.length-i;j++) {
               if(arr[j] >arr[j+1]) {
                   int temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
               }
           }
       }
        
    }
    
    public static void display() {
        for(int k:arr) {
            System.out.print(k + "  ");
        }
    } 
    
    
     
  public void bubble(int arr[]){
     
      for(i=1;i<arr.length;i++){
        for(j=0;j<arr.length-1;j++){
            if(arr[j]>arr[j+1]){
                int temp;
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;  
                // Swaping completed
            }
        }
     }
  }
  public void bubblestr(String []str){
      for(i=1;i<str.length;i++){
          for(j=0;j<str.length-1;j++){
              if(str[j].compareTo(str[j+1])>0){
                  String temp;
                  temp=str[j];
                  str[j]=str[j+1];
                  str[j+1]=temp;
                  // string swaping completed
              }
          }
      }
  }
  public void displayBubbleStr(String []str){
      for(i=0;i<str.length;i++){
          System.out.println(str[i]);
      }
  }
  public void displayBubbleSort(int arr[]){
      int i;
      
      for(i=0;i<arr.length;i++){
          System.out.print(arr[i] +" ");
      }
  }
    
}
