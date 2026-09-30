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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null)return null;

        else if(root.val>key){
            root.left= deleteNode(root.left,key);

        }
        else if(root.val<key){
            root.right=deleteNode(root.right,key);
        }
        else{

            if(root.left==null && root.right==null)return null;

            else if(root.right==null){
                return root.left;
            }
            else if(root.left==null)return root.right;

            else{
                TreeNode sus=root.right;

                while(sus.left!=null){
                    sus=sus.left;
                }

                root.val=sus.val;

                root.right=deleteNode(root.right,sus.val);
            }
        }

        return root;

        

    }

   
    
}