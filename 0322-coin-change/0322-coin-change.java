class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        
        int[][] dp=new int[n][amount+1];

        for(int[] r:dp){
            Arrays.fill(r,-1);
        }
        int ans=solve(n-1,coins,amount,dp);

        if(ans==1000000000)return -1;
        return ans;
    }
    int solve(int num,int[] coins,int amount,int[][] dp){
        if(amount==0)return 0;
        if(num==0){
            if(amount%coins[0]==0){
                return amount/coins[0];
            }
            else{
                return 1000000000;
            }
        }
        if(dp[num][amount]!=-1){
            return dp[num][amount];
        }
        int take=1000000000;
        if(coins[num]<=amount){
            take=1+solve(num,coins,amount-coins[num],dp);
        }
        int nottake=solve(num-1,coins,amount,dp);

        return dp[num][amount]=Math.min(take,nottake);
    }
}