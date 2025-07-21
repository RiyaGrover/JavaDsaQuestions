//Link - https://leetcode.com/problems/flood-fill/

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColour = image[sr][sc];
        if(originalColour == color ) return image;
        dfs(image, sr, sc, originalColour, color);
        return image;
    }
  private void dfs(int [][] image, int r, int c, int originalColour, int color){
    if(r < 0 || r>= image.length || c<0||
     c>= image[0].length || image[r][c] != originalColour){
        return;
     }
     image[r][c] = color;
     dfs(image, r+1,c, originalColour, color);
      dfs(image, r-1,c, originalColour, color);
       dfs(image, r,c+1, originalColour, color);
        dfs(image, r,c-1, originalColour, color);
  }

}