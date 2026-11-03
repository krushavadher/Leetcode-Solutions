class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        
        List<List<Integer>> ans=new ArrayList<>();
        solve(k,n,ans,new ArrayList<>(),1);
        return ans;
    }
    void solve(int k,int n,List<List<Integer>> ans,List<Integer> temp,int idx){
        if(temp.size()==k && n==0){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i=idx;i<=9;i++){
            
            if(i>n)continue;
            if(temp.size()>k)return;
            temp.add(i);
            solve(k,n-i,ans,temp,i+1);
            temp.remove(temp.size()-1);


            
        }
    }
}