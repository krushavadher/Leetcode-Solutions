class Solution {
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;

        int[] color=new int[graph.length];

        Arrays.fill(color,-1);
        for(int i=0;i<n;i++){
            if(color[i]==-1){
                if(!bfs(i,graph,color)){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean bfs(int st,int[][] graph,int[] color){
        Queue<Integer> q=new LinkedList<>();

        q.offer(st);
        while(!q.isEmpty()){
            int cur=q.poll();

            for(int neigh:graph[cur]){

                if(color[neigh]==-1){
                    color[neigh]=1-color[cur];
                    q.offer(neigh);
                }
                else if(color[neigh]==color[cur]){
                    return false;
                }

            }

        }
        return true;

    }
}