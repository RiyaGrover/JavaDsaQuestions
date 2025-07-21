// https://leetcode.com/problems/binary-tree-inorder-traversal/description/


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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();

        if(root == null){
            return ans;
        }

       
        ans.addAll(inorderTraversal(root.left)); // Add left subtree values
         ans.add(root.val);
        ans.addAll(inorderTraversal(root.right)); // Add right subtree values

        return ans;
    }
}