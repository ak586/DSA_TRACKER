package a4Graphs.traversals;

import java.util.*;

import java.io.*;

/* Approach is very simillar to pre order of the tree traversals */
class DFS {
    // Function to return a list containing the DFS traversal of the graph.
    public static void dfs(int currNode, ArrayList<ArrayList<Integer>> adj, boolean visited[], ArrayList<Integer> ans) {
        ans.add(currNode);
        for (int node : adj.get(currNode)) {
            if (!visited[node]) {
                visited[node] = true;
                dfs(node, adj, visited, ans);
            }
        }
    }

    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans = new ArrayList<>();
        boolean visited[] = new boolean[V];
        visited[0] = true;
        dfs(0, adj, visited, ans);
        return ans;
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
            for (int i = 0; i < V; i++)
                adj.add(new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            DFS obj = new DFS();
            ArrayList<Integer> ans = obj.dfsOfGraph(V, adj);
            for (int i = 0; i < ans.size(); i++)
                System.out.print(ans.get(i) + " ");
            System.out.println();
        }
    }
}
