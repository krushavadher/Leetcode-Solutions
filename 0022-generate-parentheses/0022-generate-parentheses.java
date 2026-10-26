class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        solve(0,0,n,ans,"");
        return ans;
    }
    void solve(int open,int close,int n,List<String> ans,String curr){
        if(open==close && open==n){
            ans.add(curr);
            return ;
        }
        if(open<n){
            solve(open+1,close,n,ans,curr+"(");
        }
        if(close<open){
            solve(open,close+1,n,ans,curr+")");
        }
    }
}