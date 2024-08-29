// done through bubble sort 
//  Question - https://leetcode.com/problems/sort-colors/description/

class Solution {
    public void sortColors(int[] nums) {
        for(int i = 1; i <= nums.length-1 ; i++){
            for(int j = 0; j < nums.length-i ; j++){
                if(nums[j+1] < nums[j]){
                    int temp= nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        
    }
}