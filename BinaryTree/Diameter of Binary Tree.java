// https://leetcode.com/problems/diameter-of-binary-tree/description/

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
    static int maxDia;
    public int diameterOfBinaryTree(TreeNode root) {
        maxDia = 0;
        level(root);
        return maxDia;
        
    }

    public int level(TreeNode root){
        if(root == null) return 0;
        int left = level(root.left);
        int right = level(root.right);
        int sum = left + right;
        maxDia = Math.max(sum , maxDia);
        return Math.max(left, right) +1;
    }
}