package a4Graphs;

import java.util.*;

class ShortestDistFromSource {

    static void bfs(int source, List<List<Integer>> adj, List<Integer> level, boolean visited[]) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(source);
        while (!q.isEmpty()) {
            int front = q.poll();
            for (int node : adj.get(front)) {
                if (visited[node])
                    continue;
                visited[node] = true;
                q.add(node);
                level.set(node, level.get(front) + 1);
            }

        }
    }

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++)
            adj.add(new ArrayList<>());

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        int source = sc.nextInt();
        sc.close();
        List<Integer> level = new ArrayList<>(Collections.nCopies(n + 1, 0));
        boolean visited[] = new boolean[n + 1];
        visited[source] = true;
        level.set(source, 0);
        bfs(source, adj, level, visited);

        for (int i = 1; i <= n; i++)
            System.out.print(level.get(i) + " ");

    }
}
