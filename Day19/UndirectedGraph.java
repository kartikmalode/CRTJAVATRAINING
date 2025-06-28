package Day19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UndirectedGraph {
    
    private Map<Integer,List<Integer>> adjlist;
    public UndirectedGraph(){
        adjlist = new HashMap<>();
    }
   
    public void addedge(int u,int v){
        adjlist.putIfAbsent(u, new ArrayList<>());
        adjlist.putIfAbsent(v, new ArrayList<>());

        adjlist.get(u).add(v);
        adjlist.get(v).add(u);
    }

    public void printgraph(){
        System.out.println("undirecterd greph adjency list");
        for(Map.Entry<Integer,List<Integer>> entry:adjlist.entrySet()){
            System.out.print(entry.getKey()+"->");
            for(int neighbor:entry.getValue()){
                System.out.print(neighbor+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        UndirectedGraph graph = new  UndirectedGraph();
        Scanner sc = new Scanner(System.in);
        int numedges = sc.nextInt();

        for(int i=0; i<numedges; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.addedge(u,v);
        }
        
        
        graph.printgraph();
    }
}
