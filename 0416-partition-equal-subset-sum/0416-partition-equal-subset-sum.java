class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        int n=nums.length;
        for(int num:nums){
            sum+=num;
        }
        if(sum%2!=0)return false;
        int target=sum/2;
        int[][] dp=new int[n+1][target+1];
        for(int[] r:dp){
            Arrays.fill(r,-1);
        }

        return solve(nums,n-1,target,dp);
    }
    boolean solve(int[] nums,int idx,int target,int[][] dp){
        if(target==0)return true;

        if(target<0 || idx<0)return false;
        if(dp[idx][target]!=-1)return dp[idx][target]==1;

        boolean notpick=solve(nums,idx-1,target,dp);

        boolean pick=false;

        if(nums[idx]<=target){
            pick=solve(nums,idx-1,target-nums[idx],dp);
        }
        boolean ans=pick||notpick;
        dp[idx][target]=ans?1:0;
        return ans;
    }
}