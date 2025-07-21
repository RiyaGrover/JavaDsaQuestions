// Link - https://leetcode.com/problems/rotting-oranges/description/


class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid == null || grid.length == 0) return 0;

        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int freshOranges = 0;
        for(int i =0; i < rows ; i++){
            for(int j = 0; j < cols ; j++){
                if(grid[i][j] == 2){
                    queue.offer(new int[]{i, j});
                } else if(grid[i][j] == 1){
                    freshOranges++;
                }
            }
        }

        if(freshOranges == 0) return 0;
        int min = 0;
        int [] dx = {0,0, 1, -1};
        int [] dy = {1,-1,0,0};
        while(!queue.isEmpty()){
            int size = queue.size();
            boolean rottedThisMin = false;
            for(int i =0; i < size ;i++){
                int [] point = queue.poll();
                int x = point[0];
                int y = point[1];
                for(int d =0; d<4;d++){
                    int newX = x+dx[d];
                    int newY = y+dy[d];

                    if(newX >=0 && newY >=0 && newX < rows && 
                    newY < cols && grid[newX][newY]== 1){
                        grid[newX][newY] =2;
                        queue.offer(new int[]{newX, newY});
                        freshOranges--;
                        rottedThisMin=true;
                    }
                }
            }
            if(rottedThisMin){
                min++;
            }
           
        }
 return freshOranges == 0?min :-1;
    }
}