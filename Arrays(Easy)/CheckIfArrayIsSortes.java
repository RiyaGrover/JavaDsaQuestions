class Solution {
    public boolean check(int[] nums) {

        for(int i = 1; i < nums.length ; i++){
            if(nums[i] >= nums[i-1]){

            } else {
                return false;
            } 
            
        } return true;
        
    }
}