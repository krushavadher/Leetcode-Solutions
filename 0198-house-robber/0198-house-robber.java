class Solution {  
    public int rob(int[] nums) {
        int[] dp=new int[nums.length+1];
        Arrays.fill(dp,-1);
       return solve(dp,nums.length,nums);
        
    }
    int solve(int[] dp,int n,int[] arr){
        if(n<=0)return 0;
        if(n==1)return arr[0];

        if(dp[n]!=-1)return dp[n];

        int pick=arr[n-1]+solve(dp,n-2,arr);
        int notpick=solve(dp,n-1,arr);

        dp[n]=Math.max(pick,notpick);
        return dp[n];

        
    }
}