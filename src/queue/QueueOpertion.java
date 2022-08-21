package queue;

//Queue using array
public class QueueOpertion {
    public Queue obj;
    
    public void createQueue(int size){
        obj=new Queue();
        obj.capacity=size;
        obj.rear=-1;
        obj.front=-1;
        obj.arr=new int[size];
    }
    
    public void insertRear(int data){
        if(obj.rear==obj.capacity-1 && obj.front==0 || obj.rear+1==obj.front){
            System.out.println("OverFlow");
        }
        else if(obj.rear==-1){
            obj.rear++;
            obj.front++;
            obj.arr[obj.rear]=data;
        }
        else if(obj.rear==obj.capacity-1){
            obj.rear=0;
            obj.arr[obj.rear]=data;
        }
        else {
            obj.rear++;
            obj.arr[obj.rear]=data;
        }
    }
    public void deletion(){
        if(obj.front==-1){
            System.out.println("Onderflow");
        }
        else if(obj.front==obj.rear){
            obj.rear=-1;
            obj.front=-1;
        }
        else if(obj.front==obj.capacity-1)
            obj.front=0;
        else 
            obj.front++;
    }
}
