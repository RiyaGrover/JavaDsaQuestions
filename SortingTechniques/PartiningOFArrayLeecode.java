// Question : https://leetcode.com/problems/partition-array-according-to-given-pivot/description/

class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] result = new int[nums.length];
        int k = 0;

        // Place elements less than the pivot
        for (int num : nums) {
            if (num < pivot) {
                result[k++] = num;
            }
        }

        // Place elements equal to the pivot
        for (int num : nums) {
            if (num == pivot) {
                result[k++] = num;
            }
        }

        // Place elements greater than the pivot
        for (int num : nums) {
            if (num > pivot) {
                result[k++] = num;
            }
        }

        return result;
    }
}
