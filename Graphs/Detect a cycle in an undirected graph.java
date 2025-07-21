//  https://takeuforward.org/plus/dsa/problems/detect-a-cycle-in-an-undirected-graph

class Solution {
   public boolean isCycle(int V, List<List<Integer>> adj) {
        boolean[] visited = new boolean[V];

        // Loop through all components (for disconnected graphs)
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (bfsCheckCycle(i, adj, visited)) {
                    return true; // Cycle found
                }
            }
        }
        return false; // No cycles found
    }

    private boolean bfsCheckCycle(int start, List<List<Integer>> adj, boolean[] visited) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{start, -1}); // {currentNode, parent}
        visited[start] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int node = current[0];
            int parent = current[1];

            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(new int[]{neighbor, node});
                } else if (neighbor != parent) {
                    // If already visited and not coming back to parent → cycle
                    return true;
                }
            }
        }
        return false;
    }