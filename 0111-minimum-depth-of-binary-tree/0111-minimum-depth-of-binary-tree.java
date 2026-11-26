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
    public int minDepth(TreeNode root) {
        return solve(root);
    }
    int solve(TreeNode root){
        if(root==null)return 0;

        if(root.left==null && root.right==null){
            return 1;
        }

        else if(root.left==null || root.right==null){
            if(root.left==null){
                return 1+solve(root.right);
            }else{
                return 1+solve(root.left);
            }
        }

       else{
         int left=solve(root.left);
        int right=solve(root.right);
        return Math.min(left,right)+1;
       }
    }
}