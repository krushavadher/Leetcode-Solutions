class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans=new ArrayList<>();
        solve(0,ans,new ArrayList<>(),target,candidates);
        return ans;

        
    }
    void solve(int idx,List<List<Integer>> ans,List<Integer> curr,int t,int[] arr){
        if(t==0){
            ans.add(new ArrayList<>(curr));
            return ;
        }
        for(int i=idx;i<arr.length;i++){
            if(i>idx && arr[i]==arr[i-1]){
                continue;
            }
            if(arr[i]>t){
                break;
            }
            curr.add(arr[i]);
            solve(i+1,ans,curr,t-arr[i],arr);
            curr.remove(curr.size()-1);
        }
    }
}