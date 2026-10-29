class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;

        int[][] dp=new int[m][n];
        for(int[] r:dp){
            Arrays.fill(r,-1);

        }
        return solve(obstacleGrid,m-1,n-1,dp);
    }
    int solve(int[][] arr,int m,int n,int[][] dp){

        if(m==0 && n==0 && arr[m][n]!=1){
            return 1;
        }
        if(m<0 || n<0 || arr[m][n]==1){
            return 0;
        }
        if(dp[m][n]!=-1)return dp[m][n];

        int left=solve(arr,m-1,n,dp);
        int top=solve(arr,m,n-1,dp);

        return dp[m][n]=left+top;
       

    }
}