class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        boolean[] used=new boolean[nums.length];
        solve(nums,used,new ArrayList<>(),ans);
        return ans;
    }
    void solve(int[] nums,boolean[] visited,List<Integer> curr,List<List<Integer>> ans){
        if(curr.size()==nums.length){
            ans.add(new ArrayList<>(curr));
        }
        for(int i=0;i<nums.length;i++){
            if(visited[i])continue;

            visited[i]=true;
            curr.add(nums[i]);
            solve(nums,visited,curr,ans);
            curr.remove(curr.size()-1);
            visited[i]=false;
        }
    }
} 