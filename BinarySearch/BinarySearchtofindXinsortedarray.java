///Through Recursion

class Solution {
    public int search(int[] nums, int target) {
        return searchFunc(nums, 0, nums.length -1, target);

    }

    public int searchFunc (int[] nums, int low, int high, int target){
        int n = nums.length;
    
        if(low > high) return -1;
        int mid = (low + high)/2;
        if(nums[mid] == target) return mid;
        else if(target > nums[mid]){
            return searchFunc(nums, mid+1, high, target);
        } else {
            return searchFunc(nums, low, mid-1, target);
        }
    }
}