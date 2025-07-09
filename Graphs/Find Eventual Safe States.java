import java.util.*;

class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        boolean[] visited = new boolean[n];
        boolean[] path = new boolean[n];
        boolean[] safe = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i, graph, visited, path, safe);
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (safe[i]) {
                result.add(i);
            }
        }

        return result;
    }

    private boolean dfs(int node, int[][] graph, boolean[] visited, boolean[] path, boolean[] safe) {
        visited[node] = true;
        path[node] = true;

        for (int neighbor : graph[node]) {
            if (!visited[neighbor]) {
                if (!dfs(neighbor, graph, visited, path, safe)) {
                    return false;
                }
            } else if (path[neighbor]) {
                return false; // cycle detected
            }
        }

        path[node] = false;
        safe[node] = true;
        return true;
    }
}
