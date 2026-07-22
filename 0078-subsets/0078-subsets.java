class Solution {
     void f(int[] nums,int idx,ArrayList<Integer> list,List<List<Integer>> ans){

        if(idx==nums.length){
            ans.add(new ArrayList<>(list));
            return ;
        }
        list.add(nums[idx]);
        f(nums,idx+1,list,ans);
        list.remove(list.size()-1);
        f(nums,idx+1,list,ans);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();

        f(nums,0,new ArrayList<>(),ans);
        return ans;
    }
}