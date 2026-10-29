class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {

        int m=triangle.size();
        
        int[][] dp=new int[m][m];

        for(int[] r:dp){
            Arrays.fill(r,Integer.MAX_VALUE);
        }
        return solve(0,0,triangle,dp);
    }
    int solve(int i,int j,List<List<Integer>> list,int[][] dp){
        if(i==list.size()-1)return list.get(i).get(j);

        if(dp[i][j]!=Integer.MAX_VALUE){
            return dp[i][j];
        }

        int left=list.get(i).get(j)+solve(i+1,j,list,dp);
        int right=list.get(i).get(j)+solve(i+1,j+1,list,dp);

        return dp[i][j]=Math.min(left,right);
    }
}