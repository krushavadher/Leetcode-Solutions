class Solution {
    public int numDecodings(String s) {
        int n=s.length();
        int[] dp=new int[n];

        Arrays.fill(dp,-1);
        return solve(dp,0,s);
    }
    int solve(int[] dp,int i,String s){
        if(i==s.length())return 1;
        if(s.charAt(i)=='0')return 0;

        if(dp[i]!=-1)return dp[i];
        int one=solve(dp,i+1,s);

        int two=0;

        if(i+1<s.length() && (s.charAt(i)=='1' || (s.charAt(i)=='2' && s.charAt(i+1)<='6'))){
            two=solve(dp,i+2,s);
        }
        dp[i]=one+two;
        return dp[i];


    }
}