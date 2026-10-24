class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        int n=accounts.size();
        DSU dsu=new DSU( n);
        HashMap<String,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++){
            for(int j=1;j<accounts.get(i).size();j++){
                if(map.containsKey(accounts.get(i).get(j))){
                    dsu.union(map.get(accounts.get(i).get(j)),i);
                }
                else{
                    map.put(accounts.get(i).get(j),i);
                }
            }
        }
        HashMap<Integer,TreeSet<String>> merge=new HashMap<>();
        List<List<String>> ans=new ArrayList<>();



        for (String key : map.keySet()) {
            int parent = dsu.find(map.get(key));
            if(!merge.containsKey(parent)){
                merge.put(parent,new TreeSet<>());
            }
            merge.get(parent).add(key);
           
        }
         for (int parent : merge.keySet()) {
            List<String> temp = new ArrayList<>();

            temp.add(accounts.get(parent).get(0));
            temp.addAll(merge.get(parent));

            ans.add(temp);
        }
        return ans;


    }

    class DSU {
        int[] p;
        int[] size;

        DSU(int n) {
            p = new int[n];
            size = new int[n];

            for (int i = 0; i < n; i++) {
                p[i] = i;
                size[i] = 1;
            }
        }

        int find(int x) {
            if (p[x] == x) {
                return x;
            }
            return p[x] = find(p[x]);
        }

        void union(int u, int v) {
            int pu = find(u);
            int pv = find(v);

            if (pu == pv) {
                return;
            }
            if (size[pu] < size[pv]) {
                p[pu] = pv;
                size[pv] += size[pu];
            } else {
                p[pv] = pu;
                size[pu] += size[pv];
            }
        }
    }
}