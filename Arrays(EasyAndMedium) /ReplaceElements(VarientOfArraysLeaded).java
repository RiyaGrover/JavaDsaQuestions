// Link : https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/description/

class Solution {
    public int[] replaceElements(int[] arr) {
      int n = arr.length;
        int[] result = new int[n];  // Result array of the same size
        int max = arr[n-1];  // Start with the last element as max
        
        result[n-1] = -1;  // The last element is always -1
    
        for (int i = n-2; i >= 0; i--) {
            result[i] = max;  // Store the current max value
            if (arr[i] > max) {
                max = arr[i];  // Update max if current element is greater
            }
        }
        
        return result;  // Return the final array
    }
}