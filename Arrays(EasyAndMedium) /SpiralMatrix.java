//Link : https://leetcode.com/problems/spiral-matrix/description/


class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        List<Integer> ans = new ArrayList<>();

        int n = mat.length;
        int m = mat[0].length;

        int top = 0, left = 0, bottom = n - 1, right = m - 1;

        while (top <= bottom && left <= right) {
            // Move from left to right across the top row
            for (int i = left; i <= right; i++) {
                ans.add(mat[top][i]);
            }
            top++;

            // Move from top to bottom along the right column
            for (int i = top; i <= bottom; i++) {
                ans.add(mat[i][right]);
            }
            right--;

            // Move from right to left across the bottom row (if within bounds)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(mat[bottom][i]);
                }
                bottom--;
            }

            // Move from bottom to top along the left column (if within bounds)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(mat[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}
