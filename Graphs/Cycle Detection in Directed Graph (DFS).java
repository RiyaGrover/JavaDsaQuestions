//https://leetcode.com/problems/course-schedule-ii/description/

import java.util.*;

class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        // Step 1: Build adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] pre : prerequisites) {
            adj.get(pre[1]).add(pre[0]); // prerequisite: pre[1] → pre[0]
        }

        // Step 2: Initialize visited arrays
        int[] vis = new int[numCourses];
        int[] pathVis = new int[numCourses];
        List<Integer> topoOrder = new ArrayList<>();

        // Step 3: DFS for all nodes
        for (int i = 0; i < numCourses; i++) {
            if (vis[i] == 0) {
                if (dfs(i, adj, vis, pathVis, topoOrder)) {
                    return new int[0]; // cycle detected
                }
            }
        }

        // Step 4: Reverse topological order
        Collections.reverse(topoOrder);
        int[] res = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            res[i] = topoOrder.get(i);
        }

        return res;
    }

    private boolean dfs(int node, ArrayList<ArrayList<Integer>> adj,
                        int[] vis, int[] pathVis, List<Integer> topoOrder) {
        vis[node] = 1;
        pathVis[node] = 1;

        for (int neighbor : adj.get(node)) {
            if (vis[neighbor] == 0) {
                if (dfs(neighbor, adj, vis, pathVis, topoOrder)) return true;
            } else if (pathVis[neighbor] == 1) {
                return true; // cycle detected
            }
        }

        pathVis[node] = 0;
        topoOrder.add(node); // store in post-order
        return false;
    }
}
