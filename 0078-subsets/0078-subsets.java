class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();

        solve(0,nums,ans,new ArrayList<>());
        return ans;

    }

    void solve(int idx,int[] arr,List<List<Integer>> ans,List<Integer> curr){
        if(idx==arr.length){
            ans.add(new ArrayList<>(curr));
            return ;
        }
        solve(idx+1,arr,ans,curr);
        curr.add(arr[idx]);
        solve(idx+1,arr,ans,curr);
        curr.remove(curr.size()-1);

    }


}