class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int  n=edges.length;

        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();

        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        int[] ans=new int[2];

        for(int[] edge:edges){

            int u=edge[0];
            int v=edge[1];

            boolean[] visited=new boolean[n+1];
            if(dfs(u,v,adj,visited)){
                ans=edge;
            }
            else{
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
        }
        return ans;


    }
    public boolean dfs(int st,int t,ArrayList<ArrayList<Integer>> adj,boolean[] visited){

        if(st==t){
            return true;
        }
        visited[st]=true;

        for(int nei:adj.get(st)){
            if(!visited[nei]){
                if(dfs(nei,t,adj,visited)){
                    return true;
                }
            }
        }
        return false;
    }
}
