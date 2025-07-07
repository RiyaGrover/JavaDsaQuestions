// https://leetcode.com/problems/number-of-enclaves/description/

import java.util.*;

class Solution {
    public int numEnclaves(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        boolean[][] vis = new boolean[r][c];
        Queue<int[]> que = new LinkedList<>();

        // Add all boundary land cells to the queue and mark visited immediately ✅
        for (int i = 0; i < r; i++) {
            if (grid[i][0] == 1 && !vis[i][0]) {
                que.offer(new int[]{i, 0});
                vis[i][0] = true; // ✅ mark visited on enqueue
            }
            if (grid[i][c - 1] == 1 && !vis[i][c - 1]) {
                que.offer(new int[]{i, c - 1});
                vis[i][c - 1] = true; // ✅
            }
        }

        for (int j = 0; j < c; j++) {
            if (grid[0][j] == 1 && !vis[0][j]) {
                que.offer(new int[]{0, j});
                vis[0][j] = true; // ✅
            }
            if (grid[r - 1][j] == 1 && !vis[r - 1][j]) {
                que.offer(new int[]{r - 1, j});
                vis[r - 1][j] = true; // ✅
            }
        }

        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};

        while (!que.isEmpty()) {
            int[] cell = que.poll();
            int x = cell[0];
            int y = cell[1];

            for (int d = 0; d < 4; d++) {
                int newX = x + dx[d];
                int newY = y + dy[d];

                if (newX >= 0 && newX < r && newY >= 0 && newY < c &&
                    grid[newX][newY] == 1 && !vis[newX][newY]) {
                    vis[newX][newY] = true; // ✅ mark visited BEFORE enqueue
                    que.offer(new int[]{newX, newY});
                }
            }
        }

        int cnt = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == 1 && !vis[i][j]) {
                    cnt++;
                }
            }
        }

        return cnt;
    }
}


