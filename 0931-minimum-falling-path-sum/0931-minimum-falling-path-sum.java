class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int ans=Integer.MAX_VALUE;
        int n=matrix.length;
        int[][] dp=new int[n][n];
        for(int[] r:dp){
            Arrays.fill(r,Integer.MAX_VALUE);
        }
        for(int i=0;i<matrix.length;i++){
            ans=Math.min(ans,solve(matrix,0,i,dp));
        }
        return ans;
    }

    int solve(int[][] arr,int i,int j,int[][] dp){
        if(j<0 || j>=arr.length)return Integer.MAX_VALUE;
        if(i==arr.length-1)return arr[i][j];
       
        if(dp[i][j]!=Integer.MAX_VALUE)return dp[i][j];
        int dl=solve(arr,i+1,j-1,dp);
        int dr=solve(arr,i+1,j+1,dp);
        int bottom=solve(arr,i+1,j,dp);

        return dp[i][j]=arr[i][j]+Math.min(dl,Math.min(dr,bottom));

    }

}