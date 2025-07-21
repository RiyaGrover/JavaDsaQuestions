// https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/description/

class Solution {
    public int minAddToMakeValid(String s) {
        int open = 0;
        int insertions = 0;
        for(char c : s.toCharArray()){
            if(c == '('){
                open++;
            } else {
                if(open > 0){
                    open--;
                } else {
                    insertions++;
                }
            }
        }
        return insertions+open;
        
    }
}