package Day20;
import java.util.*;

public class BFS {
    private Map<Integer,List<Integer>> adjlist;

    public BFS(){
        adjlist = new HashMap<>();
    }

    public void addedge(int u,int v){
       adjlist.putIfAbsent(u, new ArrayList<>());
       adjlist.putIfAbsent(v, new ArrayList<>());

       adjlist.get(u).add(v);
       adjlist.get(v).add(u);
    }

    public void bfs(int start){
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> q  = new LinkedList<>();

        visited.add(start);
        q.add(start);
        System.out.println("bfs trversal");

        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node+" ");

            for(int neighbor :adjlist.getOrDefault(node, new ArrayList<>())){
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    q.add(neighbor);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        BFS graph = new BFS();
        graph.addedge(0, 1);
        graph.addedge(0, 2);
        graph.addedge(1, 3);
        graph.addedge(2, 4);
        graph.addedge(3, 4);
        graph.addedge(3, 5);

        graph.bfs(0);
    }
}
