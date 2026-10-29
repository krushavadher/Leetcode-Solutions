class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n=nums.length;int total=0;
        for(int num:nums){
            total+=num;
        }
        int[][] dp=new int[n+1][2*total+1];
        for(int[] r:dp){
            Arrays.fill(r,Integer.MAX_VALUE);
        }
        return solve(nums,0,n-1,target,dp,total);
    }
    int solve(int[] arr,int sum,int idx,int t,int[][] dp,int total){
        if(idx<0){
            if(sum==t){
                return 1;
            }
            return 0;
        }
        if(idx>=0){
            if(dp[idx][sum+total]!=Integer.MAX_VALUE)return dp[idx][sum+total];
        }
        int sub=solve(arr,sum-arr[idx],idx-1,t,dp,total);
        int add=solve(arr,sum+arr[idx],idx-1,t,dp,total);
        return dp[idx][sum+total]=add+sub;
    }
}