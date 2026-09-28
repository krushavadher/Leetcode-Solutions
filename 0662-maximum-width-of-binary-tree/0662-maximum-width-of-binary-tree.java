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
    class pair{

        TreeNode node;
        long index;
        pair(TreeNode node,long index){
            this.node=node;
            this.index=index;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        
        if(root==null)return 0;

        Queue<pair> q=new LinkedList<>();

        q.offer(new pair(root,0L));
        int ans=0;
        while(!q.isEmpty()){
            int size=q.size();

            long first=q.peek().index;
            long last=first;

            for(int i=0;i<size;i++){
                pair p=q.poll();

                long curr=p.index-first;
                last=curr;

                if(p.node.left!=null){
                    q.offer(new pair(p.node.left,2*curr+1));

                }
                if(p.node.right!=null){
                    q.offer(new pair(p.node.right,2*curr+2));
                }

            }
            ans=Math.max(ans,(int)(last+1));

        }
        return ans;

    }
}