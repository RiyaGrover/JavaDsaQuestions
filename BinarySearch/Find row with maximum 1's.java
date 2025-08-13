//https://takeuforward.org/plus/dsa/problems/find-row-with-maximum-1's

class Solution {
    public int rowWithMax1s(int[][] mat) {
       
       if(mat == null || mat.length == 0){
        return -1;
       }

       int rows = mat.length;
       int cols = mat[0].length;
       int maxRowIndex =-1;
       int maxCount = 0;


       for(int i =0; i < rows ; i++){
        int firstOneIndex = lowerBound(mat[i] , cols, 1);
        int countOne = cols - firstOneIndex;

        if(countOne > maxCount){
          maxCount = countOne;
          maxRowIndex = i;
        }
       }
       return maxCount > 0 ? maxRowIndex : -1;
    }

    private static int lowerBound(int[] row, int n, int target) {

      int low = 0;
      int high = n-1;
      int ans = n;
      while(low <= high){
        int mid = low +(high-low)/2;
        if(row[mid] >= target){
          ans = mid;
          high = mid-1;
        } else {
          low = mid +1;
        }
      }
      return ans;
    }
}