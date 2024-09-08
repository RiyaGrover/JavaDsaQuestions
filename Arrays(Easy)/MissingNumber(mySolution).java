
// Link : https://leetcode.com/problems/missing-number/
class Solution {
    public int missingNumber(int[] nums) {
      Arrays.sort(nums); // Sort the array
        int n = nums.length;

        // Check for the missing number at the beginning
        if (nums[0] != 0) {
            return 0; // If 0 is missing
        }

        // Check for missing number in the middle
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] + 1 != nums[i + 1]) {
                return nums[i] + 1; // Return the missing number
            }
        }

        // If no missing number in the middle, it must be the last number
        return n;
    }
}