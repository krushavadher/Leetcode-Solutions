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
    public boolean isSymmetric(TreeNode root) {
        
        if(root==null)return true;

        TreeNode node1=root.left;
        TreeNode node2=root.right;

        return h(node1,node2);

    }

    public boolean h(TreeNode n1,TreeNode n2){
        if(n1==null || n2==null){
            return n1==n2;
        }

       if(n1.val!=n2.val){
        return false;
       }

       return h(n1.left,n2.right) && h(n1.right,n2.left);

    }
}
