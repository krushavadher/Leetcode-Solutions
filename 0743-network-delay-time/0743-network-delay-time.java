class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<ArrayList<int[]>> adj=new ArrayList<>();

        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge:times){
            int u=edge[0];
            int v=edge[1];
            int d=edge[2];

            adj.get(u).add(new int[]{v,d});
        }
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        int[] dist=new int[n+1];

        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[k]=0;
        pq.add(new int[]{0,k});

        while(!pq.isEmpty()){
            int[] top=pq.poll();
            int d=top[0];
            int u=top[1];

            for(int[] p:adj.get(u)){
                int v=p[0];
                int w=p[1];

                if(dist[u]+w<dist[v]){
                    dist[v]=dist[u]+w;

                    pq.add(new int[]{dist[v],v});
                }
            }
        }

        int ans=0;
        for(int i=1;i<=n;i++){
            if(dist[i]==Integer.MAX_VALUE){
                return -1;
            }
            ans=Math.max(ans,dist[i]);
        }
        return ans;
    }
}