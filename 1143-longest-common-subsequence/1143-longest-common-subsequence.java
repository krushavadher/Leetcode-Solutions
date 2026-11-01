class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        int[][] dp=new int[n+1][m+1];

        for(int[] r:dp){
            Arrays.fill(r,-1);
        }
       return solve(0,0,text1,text2,dp);
        
        
    }
    int solve(int i,int j,String text1,String text2,int[][] dp){

        if(i==text1.length() || j==text2.length()){
            return 0;
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }
     
        if(text1.charAt(i)==text2.charAt(j)){
            return dp[i][j]=1+solve(i+1,j+1,text1,text2,dp);
        }
        int nottake1=solve(i+1,j,text1,text2,dp);
        int nottake2=solve(i,j+1,text1,text2,dp);

        return dp[i][j]=Math.max(nottake1,nottake2);
    }
}