class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ans=new ArrayList<>();
        solve(nums,0,new ArrayList<>(),ans);
        return ans;
    }
    void solve(int[] nums,int idx,List<Integer> curr,List<List<Integer>> ans){
        ans.add(new ArrayList<>(curr));

        for(int i=idx;i<nums.length;i++){
            curr.add(nums[i]);
            solve(nums,i+1,curr,ans);
            curr.remove(curr.size()-1);
        }
    }
}