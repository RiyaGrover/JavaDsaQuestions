// https://leetcode.com/problems/binary-tree-level-order-traversal/description/

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
    public List<List<Integer>> levelOrder(TreeNode root) {
          if (root == null) {
            return new ArrayList<>();
        }

         Queue<TreeNode> mq = new ArrayDeque<>();
        List<List<Integer>> ans = new ArrayList<>();
        mq.add(root);
        while(mq.size() > 0){

            int count = mq.size();
             List<Integer> level = new ArrayList<>();
            for(int i = 0; i < count ; i++){
                root = mq.remove();
                level.add(root.val);

                if(root.left != null){
                    mq.add(root.left);
                }
                if(root.right != null){
                    mq.add(root.right);
                }
            }
            ans.add(level);
        }
        return ans;
        
    }
}