package sorting;
import searching.*;

public class SortingControl {    
    private  int arr[]={50,20,30,60,10,40,80,100,90,70};
    private static String str[]={"mumbai","darbhanga","agra","delhi","bhopal","lacknow"};
    
   public static void main(String [] args){
       SortingControl scon=new SortingControl();
       
       for(int i=0;i<str.length;i++){
           str[i]=str[i].toUpperCase();
       }
       
       /*BubbleSort b=new BubbleSort();
       b.bubblestr(str);
       b.displayBubbleStr(str);*/
       /*b.bubble(scon.arr);
       b.displayBubbleSort(scon.arr);*/
       
       /*SelectionSort s=new SelectionSort();
       s.selectionStr(str);
       s.displayStr(str);*/
       /*s.selection(scon.arr);
       s.displaySelectionSort(scon.arr); */
      
      /*BinarySearch b=new BinarySearch();
      System.out.println(b.binarySearch(scon.arr,40)); */
       
      //LinerSearch l =new LinerSearch();
       //l.linearSearch(scon.arr, 70);
       
       InsertionSort IS=new InsertionSort();
       IS.insertion(scon.arr);
       IS.displayInsertion(scon.arr);
       
       
   }
}
