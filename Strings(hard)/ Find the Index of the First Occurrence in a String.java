// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/

// Brute force 

class Solution {
    public int strStr(String haystack, String needle) {
      
        char[] s1 = haystack.toCharArray();
        char[] s2 = needle.toCharArray();
        int m = haystack.length();
        int n = needle.length();

        for(int i = 0; i <= m-n ; i++){
            for(int j = 0; j < n ; j++){
                if(s1[i+j] != s2[j]){
                    break;
                }
                if(j == n-1){
                    return i;
                }
            }
        }
        return -1;
    }
}