// https://leetcode.com/problems/count-and-say/description/

class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
        String prev = countAndSay(n-1);
        StringBuilder result = new StringBuilder();

        int count = 1;
        char currChar = prev.charAt(0);
        for(int i = 1; i < prev.length() ;i++){
            if(prev.charAt(i) == currChar){
                count++;
            } else {
                result.append(count).append(currChar);
                currChar = prev.charAt(i);
                count = 1;

            }
        }  
        result.append(count).append(currChar);
        return result.toString();    
    }
}