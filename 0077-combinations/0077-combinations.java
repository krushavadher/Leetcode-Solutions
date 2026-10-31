class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        boolean[] visited=new boolean[n+1];
        solve(n,k,1,visited,new ArrayList<>(),ans);

        return ans;
    }
    void solve(int n,int k,int start,boolean[] visited,ArrayList<Integer> curr,List<List<Integer>> ans){
        if(curr.size()==k){
            ans.add(new ArrayList<>(curr));
        }

        for(int i=start;i<=n;i++){
            if(curr.size()>k)return;
            if(visited[i])continue;
            
            curr.add(i);
            visited[i]=true;
            solve(n,k,i+1,visited,curr,ans);
            curr.remove(curr.size()-1);
            visited[i]=false;
        }
    }
}