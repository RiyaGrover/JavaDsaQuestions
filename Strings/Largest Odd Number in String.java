// Link : https://leetcode.com/problems/largest-odd-number-in-string/description/


class Solution {
    public String largestOddNumber(String nums) {
        // Start from the last character and move towards the beginning
        for (int i = nums.length() - 1; i >= 0; i--) {
            // Check if the current character is odd
            if ((nums.charAt(i) - '0') % 2 == 1) {
                // If it's odd, return the substring from 0 to i+1
                return nums.substring(0, i + 1);
            }
        }
        // If no odd number found, return an empty string
        return "";
    }
}
