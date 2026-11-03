class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        solve(candidates,ans,target,new ArrayList<>(),0);
        return ans;
    }
    void solve(int[] arr,List<List<Integer>> ans,int target,List<Integer> temp,int idx){
        if(target==0){
            ans.add(new ArrayList<>(temp));
            return;
            
        }
        for(int i=idx;i<arr.length;i++){

            if(arr[i]>target){
                continue;
            }
            temp.add(arr[i]);
            solve(arr,ans,target-arr[i],temp,i);

            temp.remove(temp.size()-1);
        }
        
        

    }
}