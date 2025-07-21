// https://leetcode.com/problems/01-matrix/description/

class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;
        int[][] dist = new int[r][c];
        boolean[][] vis = new boolean[r][c];
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (mat[i][j] == 0) {
                    q.offer(new int[] { i, j });
                    vis[i][j] = true;
                }
            }
        }

        int[] dx = { 0, 0, 1, -1 };
        int[] dy = { 1, -1, 0, 0 };
        while (!q.isEmpty()) {
            int[] pt = q.poll();
            int x = pt[0];
            int y = pt[1];
            for (int d = 0; d < 4; d++) {
                int newX = x + dx[d];
                int newY = y + dy[d];

                if (newX >= 0 && newX < r && newY >= 0 && newY < c && !vis[newX][newY]) {
                     dist[newX][newY] = dist[x][y] + 1;
                     vis[newX][newY] = true;
                      q.offer(new int[] { newX, newY });
                }
            }
        }
        return dist;

    }
}