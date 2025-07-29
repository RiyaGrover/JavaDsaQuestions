// https://leetcode.com/problems/house-robber-ii/description/

class Solution {

    private int robRange(int [] nums, int start, int end){
        int prev= nums[start];
        int prev2 = 0;

        for(int i = start+1; i <= end;i++){
            int take = nums[i];
            if(i > start+1) take += prev2;
            int nontake = prev;
            int curr = Math.max(take,nontake);
            prev2 = prev;
            prev = curr;

        }
        return prev;
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        if(n == 1) return nums[0];
        int max1 = robRange(nums , 0, n-2);
        int max2 = robRange(nums , 1, n-1);
        return Math.max(max1, max2);
    }
}