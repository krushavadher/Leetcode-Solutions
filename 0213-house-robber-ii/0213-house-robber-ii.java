class Solution {
    public int rob(int[] nums) {
        int n=nums.length;

         if (n == 1) return nums[0];
        int[] dp=new int[n+1];

        Arrays.fill(dp,-1);
        int a=solve(nums,dp,n-2,0);
        Arrays.fill(dp,-1);
        int b=solve(nums,dp,n-1,1);
        return Math.max(a,b);

        
    }
    int solve(int[] nums,int[] dp,int n,int st){
        if(n<st)return 0;
        if(n==st){
            return nums[n];
        }

        if(dp[n]!=-1)return dp[n];

        int pick=nums[n]+solve(nums,dp,n-2,st);
        int notpick=solve(nums,dp,n-1,st);
        dp[n]=Math.max(pick,notpick);
        return dp[n];
    }
}