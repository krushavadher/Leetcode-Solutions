class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n=nums.length;
        return solve(nums,0,n-1,target);
    }
    int solve(int[] arr,int sum,int idx,int t){
        if(idx<0){
            if(sum==t){
                return 1;
            }
            return 0;
        }
        int sub=solve(arr,sum-arr[idx],idx-1,t);
        int add=solve(arr,sum+arr[idx],idx-1,t);
        return add+sub;
    }
}