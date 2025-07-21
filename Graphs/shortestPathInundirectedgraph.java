import java.util.*;

class Solution {
    public int[] shortestPath(int[][] edges, int N, int M) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        // Step 1: Build adjacency list
        for (int i = 0; i < N; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u); // undirected
        }

        // Step 2: Initialize distance array
        int[] dist = new int[N];
        Arrays.fill(dist, (int) 1e9);

        int src = 0; // Assuming source is node 0
        dist[src] = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(src);

        // Step 3: BFS
        while (!q.isEmpty()) {
            int node = q.poll();

            for (int neighbor : adj.get(node)) {
                if (dist[node] + 1 < dist[neighbor]) {
                    dist[neighbor] = dist[node] + 1;
                    q.add(neighbor);
                }
            }
        }

        // Step 4: Convert unreachable distances to -1
        for (int i = 0; i < N; i++) {
            if (dist[i] == (int) 1e9) {
                dist[i] = -1;
            }
        }

        return dist;
    }
}
