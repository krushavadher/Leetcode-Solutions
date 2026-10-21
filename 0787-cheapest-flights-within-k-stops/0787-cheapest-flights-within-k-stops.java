class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<ArrayList<int[]>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge:flights){
            int u=edge[0];
            int v=edge[1];
            int wei=edge[2];
            adj.get(u).add(new int[]{v,wei});

        }
        Queue<int[]> pq=new LinkedList<>();

        pq.add(new int[]{0,src,0});

        int[] dist=new int[n];

        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src]=0;

        while(!pq.isEmpty()){
            int[] p=pq.poll();

            int s=p[0];
            int node=p[1];
            int d=p[2];

            if(s>k){
                continue;
            }

            for(int[] nei:adj.get(node)){
                int v=nei[0];
                int dis=nei[1];

                if(dis+d<dist[v]){
                    dist[v]=dis+d;
                    pq.add(new int[]{s+1,v,dis+d});
                }
            }
        }

        return (dist[dst]==Integer.MAX_VALUE?-1:dist[dst]);


    }
}