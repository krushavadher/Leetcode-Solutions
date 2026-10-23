class Solution {
    public boolean equationsPossible(String[] equations) {
        DSU dsu=new DSU(26);
        for(String s:equations){

            int u=s.charAt(0)-'a';
            int v=s.charAt(3)-'a';

            if(s.charAt(1)=='='){
                dsu.union(u,v);
            }

        }

        for(String s:equations){

            int u=s.charAt(0)-'a';
            int v=s.charAt(3)-'a';

            if(s.charAt(1)=='!'){
               if(dsu.find(u)==dsu.find(v)){
                return false;
               }
            }

        }return true;

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