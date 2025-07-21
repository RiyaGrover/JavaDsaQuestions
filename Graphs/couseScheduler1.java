import java.util.*;

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) adj.add(new ArrayList<>());

        int[] indegree = new int[numCourses];

        // Build adjacency list & indegree
        for (int[] pair : prerequisites) {
            int a = pair[0], b = pair[1];
            adj.get(b).add(a);     // b → a
            indegree[a]++;
        }

        // Queue of courses with no prerequisites
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) q.offer(i);
        }

        int completedCourses = 0;

        while (!q.isEmpty()) {
            int course = q.poll();
            completedCourses++;

            for (int next : adj.get(course)) {
                indegree[next]--;
                if (indegree[next] == 0) q.offer(next);
            }
        }

        return completedCourses == numCourses;
    }
}
