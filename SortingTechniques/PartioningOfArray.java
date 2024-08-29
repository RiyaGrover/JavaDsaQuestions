class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        
        int i = 0; 
        int j = 0;

        while(i < nums.length){
            if(nums[i] > pivot){
                i++;
            } else {
                int temp = nums[i]; 
                nums[i] = nums[j];
                nums[j] = temp;

                i++;
                j++;

            }
        }
        return nums;
    }
}