// Link : https://leetcode.com/problems/rotate-string/



class Solution {
    public boolean rotateString(String s, String goal) {
       
        if (s.length() != goal.length()) {
            return false;
        }

        // Concatenate s with itself and check if goal is a substring of the result
        String doubleS = s + s;
        return doubleS.contains(goal);
    }
}

// class Solution {
//     public boolean rotateString(String s, String goal) {
//         if (s.length() != goal.length()) {
//             return false;
//         }

//         StringBuilder sb = new StringBuilder(s); // Initialize sb with the string s

//         for (int i = 0; i < s.length(); i++) {
//             // Get the rotated string by using substring and appending parts
//             String sb1 = sb.substring(i + 1) + sb.substring(0, i + 1);

//             // Check if the rotated string matches the goal
//             if (sb1.equals(goal)) {
//                 return true;
//             }
//         }
//         return false;
//     }
// }


