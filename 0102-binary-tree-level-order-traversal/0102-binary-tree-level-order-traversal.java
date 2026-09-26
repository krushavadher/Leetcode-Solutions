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
        
         List<List<Integer>> ans=new ArrayList<>();
         Queue<TreeNode> q=new LinkedList<>();
        if(root==null)return ans;
         q.offer(root);

        while(!q.isEmpty()){

            ArrayList<Integer> t=new ArrayList<>();
            int size=q.size();

            for(int i=0;i<size;i++){
                TreeNode v=q.poll();

                t.add(v.val);

                if(v.left!=null){
                    q.offer(v.left);
                }
                if(v.right!=null){
                    q.offer(v.right);
                }

                
            }
            ans.add(t);
        }
        return ans;



    }


}