class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        solve(0,candidates,ans,new ArrayList<>(),target);
        return ans;

    }
    void solve(int idx,int[] arr,List<List<Integer>> ans,ArrayList<Integer> curr,int target){
        if(target==0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=idx;i<arr.length;i++){
            if(arr[i]>target){
                continue;
            }
            curr.add(arr[i]);
            solve(i,arr,ans,curr,target-arr[i]);
            curr.remove(curr.size()-1);
        }
    }
}