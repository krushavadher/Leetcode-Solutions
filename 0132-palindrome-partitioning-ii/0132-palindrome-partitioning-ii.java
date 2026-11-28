class Solution {
    int min;
    public int minCut(String s) {
        int[] dp=new int[s.length()+1];
        Arrays.fill(dp,-1);
        return solve(0,s,dp)-1;
        
    }
    int solve(int idx,String s,int[] dp){
        if(idx==s.length()){
            return 0;
        }
        if(dp[idx]!=-1)return dp[idx];
        int min=s.length();
        for(int i=idx;i<s.length();i++){
            String t=s.substring(idx,i+1);

            if(ispalin(t)){
                min=Math.min(solve(i+1,s,dp)+1,min);
            }
            
        }
        return dp[idx]=min;
    }

    boolean ispalin(String s){
        int st=0;
        int e=s.length()-1;

        while(st<e){
            if(s.charAt(st)!=s.charAt(e)){
                return false;
            }
            st++;
            e--;
        }
        return true;
    }
}