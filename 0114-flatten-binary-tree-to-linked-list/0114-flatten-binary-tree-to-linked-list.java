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
    public void flatten(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();

        insert(root,q);

        q.poll();
        while(!q.isEmpty()){
            root.right=q.poll();
            root.left=null;
            root=root.right;
        }


    }

    public void insert(TreeNode root,Queue<TreeNode> q){
        if(root==null)return;

        q.add(root);
        insert(root.left,q);
        insert(root.right,q);

        
    }
}