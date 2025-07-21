//link : https://leetcode.com/problems/pascals-triangle/

class Solution {
    public List<List<Integer>> generate(int n) {
         List<List<Integer>> ans = new ArrayList<>();
         for(int row = 0; row < n ; row++){
          List<Integer> currentRow = new ArrayList<>();
          long answer = 1;
          currentRow.add(1);

          for (int col = 1; col <= row; col++) {
              answer = answer * (row - col + 1) / col;
            currentRow.add((int) answer);
         }
         ans.add(currentRow);
   
    }
      return ans;
    }

}
