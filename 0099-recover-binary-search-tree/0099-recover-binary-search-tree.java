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
     TreeNode p=null;
        TreeNode q=null;
        TreeNode prev=null;
    public void recoverTree(TreeNode root) {
       
        solve(root);

        int temp=p.val;
        p.val=q.val;
        q.val=temp;

    }
    void solve(TreeNode root){
        if(root==null)return ;

        solve(root.left);

        if(prev!=null && root.val<prev.val){
            if(p==null){
                p=prev;
            }
            q=root;
        }
        prev=root;
        solve(root.right);
    }
}