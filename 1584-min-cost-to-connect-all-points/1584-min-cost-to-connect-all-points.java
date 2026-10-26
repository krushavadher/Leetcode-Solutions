class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n=points.length;
        DSU dsu=new DSU(n);
        ArrayList<int[]> adj=new ArrayList<>();

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int dist=Math.abs(points[i][0]-points[j][0])+Math.abs(points[i][1]-points[j][1]);
                adj.add(new int[]{dist,i,j});
            }

        }

        adj.sort((a,b)->Integer.compare(a[0],b[0]));
        int cost=0;
        int count=0;

        for(int[] p:adj){
            int d=p[0];
            int u=p[1];
            int v=p[2];

            if(dsu.find(u)!=dsu.find(v)){
                dsu.union(u,v);
                cost+=d;
                count++;

                if(count==n-1){
                    break;
                }
            }
        }
        return cost;


    }
    class DSU{
        int[] p;
        int[] size;

        DSU(int n){
            p=new int[n];
            size=new int[n];

            for(int i=0;i<n;i++){
                p[i]=i;
                size[i]=1;
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


            if(pu==pv)return ;
            if(size[pu]<size[pv]){
                p[pu]=pv;
                size[pv]+=size[pu];
            }
            else{
                p[pv]=pu;
                size[pu]+=size[pv];
            }
        } 

    }

}