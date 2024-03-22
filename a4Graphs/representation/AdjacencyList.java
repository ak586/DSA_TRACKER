package a4Graphs.representation;

import java.util.*;

public class AdjacencyList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        /*
         * Space complexity: O(2*E)
         * Use it when edges are less and more number of nodes are present
         */

        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++)
            adj.add(new ArrayList<>());

        for (int i = 0; i < m; i++) {
            int u = in.nextInt();
            int v = in.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        in.close();
    }
}
