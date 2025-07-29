// https://leetcode.com/problems/house-robber/description/


class Solution {
    public int rob(int[] nums) {

        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];

        int prev = nums[0];
        int prev2 = 0;
        for(int i = 1; i<nums.length ; i++){
            int take = nums[i];
            if(i>1) take += prev2;

            int nontake = 0+ prev;
            int curri = Math.max(take,nontake);
            prev2 = prev;
            prev = curri;
        }

        return prev;
        
    }
}