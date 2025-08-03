// https://leetcode.com/problems/minimum-falling-path-sum/description/

class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int [] prev = new int [n];
         int [] curr = new int [n];

         for(int j =0; j < n; j++){
            prev[j] = matrix[0][j];
         }

         for(int i = 1; i < n ;i++){
            for(int j = 0; j< n;j++){
                int up = prev[j];
                int leftd = j>0 ? prev[j-1] : Integer.MAX_VALUE;
                int rightd = j < n-1 ? prev[j+1] : Integer.MAX_VALUE;

                curr[j] = matrix[i][j] + Math.min(up, Math.min(leftd , rightd));
            }

            int [] temp = prev;
            prev= curr;
            curr = temp;
         }

         int minSum = Integer.MAX_VALUE;
         for(int val : prev){
            minSum = Math.min(minSum , val);
         }
         return minSum;
    }
}