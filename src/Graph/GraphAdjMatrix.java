package Graph;

import java.util.*;

class Graph {
    int vertice;
    int edge;
    
    int arr[][];
}


public class GraphAdjMatrix {
    Graph g=null;
    static Scanner sc=new Scanner(System.in);
    
    public void createGraph(int v,int e) {
    Graph g=new Graph();
    g.vertice=v;
    g.edge=e;
    
    g.arr=new int[v][v];
    
    for(int k=1;k<=e;k++){
        System.out.println("Enter vertex number is connected by this edge ");
        int i=sc.nextInt();
        int j=sc.nextInt();
        
        g.arr[i-1][j-1]=1;
        g.arr[j-1][i-1]=1;
        }
    }
    
    public void printGraph(){
        for(int k[]:g.arr){
        for(int i:k){
            System.out.print(i +"   ");
        }
        System.out.println("\n");
    }
    }
    public static void main(String[] args) {
        GraphAdjMatrix g1=new GraphAdjMatrix();
        
        g1.createGraph(5, 7);
        g1.printGraph();
    }
}
