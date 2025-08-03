// https://leetcode.com/problems/triangle/description/

class Solution {
    public int minimumTotal(List<List<Integer>> t) {
        int n = t.size();
        int [] dp = new int[n];

        for(int i = 0; i< n ; i++){
            dp[i] = t.get(n-1).get(i);
        }

        for(int i =n-2; i>= 0; i--){
            List<Integer> row = t.get(i);
            for(int j = 0; j < row.size(); j++){
                dp[j] = row.get(j) + Math.min(dp[j] , dp[j+1]);
              
            }
        }
        return dp[0];
    }
}