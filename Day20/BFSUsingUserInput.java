package Day20;
import java.util.*;
public class BFSUsingUserInput {
 
    private Map<Integer, List<Integer>> adjlist;

    public BFSUsingUserInput() {
        adjlist = new HashMap<>();
    }

    public void addedge(int u, int v) {
        adjlist.putIfAbsent(u, new ArrayList<>());
        adjlist.putIfAbsent(v, new ArrayList<>());
        adjlist.get(u).add(v);
        adjlist.get(v).add(u);
    }

    public void bfs(int start) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();

        visited.add(start);
        q.add(start);
        System.out.println("BFS traversal:");

        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node + " ");

            for (int neighbor : adjlist.getOrDefault(node, new ArrayList<>())) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    q.add(neighbor);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BFS graph = new BFS();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of edges: ");
        int edges = sc.nextInt();

        System.out.println("Enter each edge (u v):");
        for (int i = 0; i < edges; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.addedge(u, v);
        }

        System.out.print("Enter starting node for BFS: ");
        int start = sc.nextInt();

        graph.bfs(start);
        sc.close();
    }
}


