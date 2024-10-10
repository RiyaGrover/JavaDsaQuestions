// Link : https://leetcode.com/problems/two-sum/



/// BETTER APPROACH //   USING HASHING < WE CAN USE TWO POINTER ALSO

class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            int more = target - a;

            if (map.containsKey(more)) {
                return new int[]{map.get(more), i};
            }
            
            map.put(nums[i], i);
        }
        
        return new int[]{};
    }
}
// MY SOLUTION //  --- Brute force O(n2)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
    

        for(int i = 0; i < n - 1; i++) {
            for(int j = i + 1; j < n; j++) {  
                if(nums[i] + nums[j] == target) { 
                    return new int[]{i, j}; 
                }
            }
        }

        return new int[]{};
    }
}







