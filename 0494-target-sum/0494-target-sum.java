class Solution {
    int h(int[] nums,int t,int i,int sum){
        if(i==nums.length){
            return sum==t?1:0;
        }
        int add=h(nums,t,i+1,sum+nums[i]);
        int sub=h(nums,t,i+1,sum-nums[i]);
        return add+sub;
    }
    public int findTargetSumWays(int[] nums, int target) {
        return h(nums,target,0,0);
    }
}