
package searching;
import linkedlist.Node;
import array.ArrayAdt;

public class LinerSearch {
    private int i;
    
    public int linearSearch(int arr[],int data){
        for(i=0;i<arr.length;i++){
            if(arr[i]==data){
                System.out.println("\nThis Number is Available");
                return 1;
            }
        }
        return 0;
    }
    
    public boolean listNodeSearch(Node r,int data){
        while(r.next!=null){
            if(r.item==data){
                return true;
            }
            r=r.next;
        }
        if(r.item==data){
                return true;
        }
        return false;
    }
    
}
