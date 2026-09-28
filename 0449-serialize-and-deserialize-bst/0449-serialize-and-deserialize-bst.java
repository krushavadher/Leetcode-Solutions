/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
     static TreeNode node;
     StringBuilder sb=new StringBuilder();
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        sb.setLength(0);
        preorder(root);
      return sb.toString();

    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> q=new LinkedList<>();

        for(String s:data.split(",")){
            q.offer(s); 
        }
        return build(q);

    }
    public TreeNode build(Queue<String> q){
        
        String d=q.poll();
        if(d.equals("#")){
            return null;
        }
        TreeNode root=new TreeNode(Integer.parseInt(d));
        root.left=build(q);
        root.right=build(q);

        return root;
    }
    public void preorder(TreeNode root){
        if(root==null){
            sb.append("#,");
            return;
        }
        sb.append(root.val).append(",");
        preorder(root.left);
        preorder(root.right);

    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;