// Link :https://leetcode.com/problems/power-of-two/description/
class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }

        int val = (n &(n-1));
        if(val == 0){
            return true;
        } else {
            return false;
        }
        
    }
}