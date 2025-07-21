// https://leetcode.com/problems/is-graph-bipartite/description/

class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];
        Arrays.fill(color, -1);
        for(int i =0; i < n; i++){
            if(color[i] == -1){
                if(!dfs(graph, i, 0, color)){
                    return false;
                }
            }
        }
        return true;
    }

    private boolean dfs(int[][] graph, int node, int currColor, int[] color){
        color[node] = currColor;
        for(int n : graph[node]){
            if(color[n] == -1){
                if(!dfs(graph, n , 1-currColor, color)){
                    return false;
                }
            } else if(color[n] == currColor){
                return false;
            }
        }
        return true;
    }
}