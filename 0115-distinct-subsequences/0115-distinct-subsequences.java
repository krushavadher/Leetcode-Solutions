class Solution {
    public int numDistinct(String s, String t) {
        int n=s.length();
        int m=t.length();
        int[][] dp=new int[n][m];
        for(int[] r:dp){
            Arrays.fill(r,-1);
        }
       return solve(0,0,s,t,dp);
    }
    int solve(int i,int j,String s,String t,int[][] dp){
       
        if(j==t.length())return 1;
        if(i==s.length())return 0;
        if(dp[i][j]!=-1)return dp[i][j];

        if(s.charAt(i)==t.charAt(j)){
            return dp[i][j]=solve(i+1,j+1,s,t,dp)+solve(i+1,j,s,t,dp);
        }
        return dp[i][j]=solve(i+1,j,s,t,dp);
    }
}