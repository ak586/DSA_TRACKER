package a4Graphs.representation;

import java.util.*;

public class MatrixRepresentation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
         * Space complexity: O(n^2) some space will be unused use it only when nodes are
         * lesser and edges are more
         */

        // number of nodes
        int n = in.nextInt();
        // number of edges
        int m = in.nextInt();
        int adj[][] = new int[n + 1][n + 1];
        for (int i = 0; i < m; i++) {
            int u = in.nextInt();
            int v = in.nextInt();
            adj[u][v] = 1;
            // for undirected graph representation
            adj[v][u] = 1;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (adj[i][j] == 1)
                    System.out.println(i + "------" + j);
            }
        }
        in.close();
    }
}
