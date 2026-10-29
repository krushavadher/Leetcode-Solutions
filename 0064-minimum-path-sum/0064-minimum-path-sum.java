class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp=new int[m][n];
        for(int[] r:dp){
            Arrays.fill(r,-1);
        }
        return solve(grid,m-1,n-1,dp);
    }
    int solve(int[][] grid,int m,int n,int[][] dp){
        if(m==0 && n==0)return grid[m][n];

        if(dp[m][n]!=-1)return dp[m][n];

        int left=grid[m][n]+(n-1<0?solve(grid,m-1,n,dp):solve(grid,m,n-1,dp));
        int top=grid[m][n]+(m-1<0?solve(grid,m,n-1,dp):solve(grid,m-1,n,dp));

        return dp[m][n]=Math.min(left,top);
    }
}