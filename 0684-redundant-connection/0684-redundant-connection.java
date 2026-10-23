class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int[] ans=new int[2];
        DSU dsu=new DSU(edges.length);
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            
            if(dsu.find(v)==dsu.find(u)){
                ans=edge;
            }
            dsu.union(u,v);
        }
        
        return ans;

    }
    class DSU{
        int[] p;
        int[] size;

        DSU(int n){
            p=new int[n+1];
            size=new int[n+1];

            for(int i=0;i<=n;i++){
                p[i]=i;
                size[i]=i;
            }
        }

        int find(int x){
            if(p[x]==x){
                return x;
            }
            return p[x]=find(p[x]);
        }

        void union(int u,int v){
            int pu=find(u);
            int pv=find(v);

            if(pu==pv){
                return;
            }
            if(size[pu]<size[pv]){
                p[pu]=pv;
                size[pv]+=size[pu];
            }else{
                p[pv]=pu;
                size[pu]+=size[pv];
            }

        }
    }
}