import java.util.*;

public class MatrixGraph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0;j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        // int[][] matrix = {
        //     {0,0,1,1,0},
        //     {1,0,1,0,0},
        //     {0,0,0,1,0},
        //     {1,1,1,0,0},
        //     {1,0,0,0,1}
        // };

         n = matrix.length;
         m = matrix.length;

        Map<Integer,List<Integer>> adjlist = new HashMap<>();

        for(int i=0; i<n; i++){
            adjlist.put(i, new ArrayList<>());
            for(int j=0; j<m; j++){
                if (matrix[i][j]==1) {
                    adjlist.get(i).add(j);
                }
            }
        }
        System.out.println("print adjency list from matrix");
        for(int i=0; i<n; i++){
            System.out.print(i+"-> ");
            for(int neighbor :adjlist.get(i)){
                System.out.print(neighbor+" ");
            }
            System.out.println();
        }
    }
}
