class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        boolean[] visited=new boolean[nums.length];

        solve(nums,ans,new ArrayList<>(),visited);
        return ans;
    }
    void solve(int[] nums, List<List<Integer>> ans,List<Integer> curr,boolean[] visited){
        if(curr.size()==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }

        for(int i=0;i<nums.length;i++){
           if(visited[i])continue;

           curr.add(nums[i]);
           visited[i]=true;
           solve(nums,ans,curr,visited);
           curr.remove(curr.size()-1);
           visited[i]=false;
        }
    }
}  