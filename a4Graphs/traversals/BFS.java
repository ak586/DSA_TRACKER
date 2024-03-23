package a4Graphs.traversals;

import java.util.*;
import java.io.*;

/* 
 * BFS or level wise traversal
 * Time Complexity: 
 * SC: O(V)
 */
class BFS {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean visited[] = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        ArrayList<Integer> bfs = new ArrayList<>();
        visited[0] = true;

        while (!q.isEmpty()) {
            int currNode = q.poll();
            bfs.add(currNode);
            for (int neighbour : adj.get(currNode)) {
                if (visited[neighbour])
                    continue;
                q.offer(neighbour);
                visited[neighbour] = true;
            }
        }
        return bfs;
    }
}

/* Driver code */

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++)
                adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                // adj.get(v).add(u);
            }
            BFS obj = new BFS();
            ArrayList<Integer> ans = obj.bfsOfGraph(V, adj);
            for (int i = 0; i < ans.size(); i++)
                System.out.print(ans.get(i) + " ");
            System.out.println();
        }
    }
}
