class Solution {

    void f(int[] nums,int idx,List<List<Integer>> ans,List<Integer> list){
        ans.add(new ArrayList<>(list));
        for(int i=idx;i<nums.length;i++){
            if(i>idx && nums[i]==nums[i-1]){
                continue;
            }
            list.add(nums[i]);
            f(nums,i+1,ans,list);
            list.remove(list.size()-1);
            
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();

         f(nums,0,ans,new ArrayList<>());
         return ans;
    }
}