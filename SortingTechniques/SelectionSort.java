// getting time limit exceeded on leetcode 
//  Question : https://leetcode.com/problems/sort-an-array/
class Solution {
    public int[] sortArray(int[] nums) {
        for(int i = 0 ; i < nums.length-1 ; i++){
            int min = i;
           for(int j = i+1 ; j < nums.length ; j++){

            if(nums[min] > nums[j]){
                min = j;
            }

           }
           int temp = nums[min];
           nums[min] = nums[i];
           nums[i] = temp;
        }
         return nums;
    }
   
}

