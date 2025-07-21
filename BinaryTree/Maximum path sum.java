// https://leetcode.com/problems/binary-tree-maximum-path-sum/description/


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
    public int maxSum;
    public int maxPathSum(TreeNode root) {
        maxSum = Integer.MIN_VALUE;
        calculate(root);
        return maxSum;
        
    }

    public int calculate(TreeNode root){
        if(root == null) return 0;

        int left = Math.max(calculate(root.left) , 0);
        int right = Math.max(calculate(root.right) , 0);

        int currentPathSum = root.val + left+ right;
        maxSum = Math.max(currentPathSum , maxSum);
        return root.val + Math.max(left, right);
    }
}