// https://leetcode.com/problems/binary-tree-preorder-traversal/description/


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

    public static class Pair{
        TreeNode root;
        int state;

        Pair(TreeNode root , int state){
            this.root = root;
            this.state = state;
        }

    }
    public List<Integer> preorderTraversal(TreeNode root) {
           if (root == null) {
            return new ArrayList<>();
        }
        Stack<Pair> st = new Stack<>();
        Pair rtp = new Pair(root , 1);
        st.push(rtp);
        List<Integer> pre = new ArrayList<>();

        while(st.size() > 0){
            Pair top = st.peek();
            if(top.state == 1){
                pre.add(top.root.val);
                top.state++;

                if(top.root.left != null){
                    Pair lp = new Pair(top.root.left , 1);
                    st.push(lp);
                }


            } else if(top.state == 2){
                top.state++;

                 if(top.root.right != null){
                    Pair rp = new Pair(top.root.right , 1);
                    st.push(rp);
                }

            } else {
                st.pop();
            }
        }

        return pre;
    }
}