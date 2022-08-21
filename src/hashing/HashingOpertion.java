package hashing;

public class HashingOpertion {
    public Student s[];   //Size of student Data
    public int rolldigit;
    public int si;
    
    public void createStudentSize(int size,int rsize){
        s=new Student[size];
        si=size;
    }
    
    public void insertionData(int r,String n,int c){
        Student temp;
        temp=new Student();
        temp.roll=r;
        temp.name=n;
        temp.Class=c;
        temp.next=null;
        
        int index=hasingFunction(r);
        if(index>si){
            System.out.println("Invaild Roll Number");
        }
        else {
            if(s[index]==null){
                s[index]=temp;
                System.out.println("Insert SuccessFul");
            }
        }
        
    }
    public void hasingSearching(int r){
       int index= hasingFunction(r);
       if(index>si){
           System.out.println("Roll Not Found");
       }
       else {
           try{
            System.out.println("Roll: "+s[index].roll +" Name: "+s[index].name+ " Class:"+ s[index].Class);
           }
           catch(NullPointerException obj){
               System.out.println("Invaild Data");
           }
       }
    }
    private int hasingFunction(int r){
        return (r%si);
    }
}
