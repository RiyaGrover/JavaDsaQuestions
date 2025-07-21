// Link : https://leetcode.com/problems/remove-outermost-parentheses/description/


class Solution {
    public String removeOuterParentheses(String name) {

        StringBuilder s = new StringBuilder();
        int depth = 0;
        
       for (char c : name.toCharArray()) {
            if (c == '(') {
                if (depth > 0) { 
                    s.append(c);
                }
                depth++;
                 
                } else {
                    depth--;
                    if(depth > 0){
                        s.append(c);
                    }
                }
        }
        return s.toString();
    }
}