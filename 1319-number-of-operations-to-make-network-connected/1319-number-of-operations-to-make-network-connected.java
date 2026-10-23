class Solution {
    public int makeConnected(int n, int[][] connections) {
        if(connections.length<n-1){
            return -1;
        }
        DSU dsu=new DSU(n);

        for(int[] edge:connections){
            int u=edge[0];
            int v=edge[1];

            dsu.union(u,v);
        }
        int c=0;
        for(int i=0;i<n;i++){
            if(dsu.find(i)==i){
                c++;
            }
        }return c-1;
    }
    class DSU{
        int[] parent;
        int[] size;

        DSU(int n){
            parent=new int[n];
            size=new int[n];
            for(int i=0;i<n;i++){
                parent[i]=i;
                size[i]=1;
            }
        }
        int find(int x){
            if(parent[x]==x){
                return x;
            }
            return parent[x]=find(parent[x]);
        }
        void union(int u,int v){
            
           int pu=find(u);
           int pv=find(v);

            if(pu==pv){
                return ;
            }
            if(size[pu]<size[pv]){
                parent[pu]=pv;
                size[pv]+=size[pu];
            }else{
                parent[pv]=pu;
                size[pu]+=size[pv];
            }



        }
    }
}