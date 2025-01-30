// Link :https://leetcode.com/problems/balanced-binary-tree/description/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
      boolean isBal = true;
    public boolean isBalanced(TreeNode root) {
     checkHeight(root);
     return isBal;
}

public int checkHeight(TreeNode root){
    if(root == null){
        return 0;
    }

    int lh = checkHeight(root.left);
    int rh = checkHeight(root.right);

    int gap = Math.abs(lh - rh);
    if(gap > 1){
        isBal= false;
    }
    return Math.max(lh, rh)+1;
 }
}