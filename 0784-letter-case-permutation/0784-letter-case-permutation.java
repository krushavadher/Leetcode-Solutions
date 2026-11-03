class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> ans=new ArrayList<>();
        solve(0,s,ans,"");
        return ans;
    }
    void solve(int idx,String s,List<String> ans,String temp){
        if(idx==s.length()){
            ans.add(temp);
            return ;
        }
        solve(idx+1,s,ans,temp+s.charAt(idx));
        if(Character.isLetter(s.charAt(idx))){
            if(Character.isLowerCase(s.charAt(idx))){
                solve(idx+1,s,ans,temp+Character.toUpperCase(s.charAt(idx)));
            }
            else{
                solve(idx+1,s,ans,temp+Character.toLowerCase(s.charAt(idx)));
            }
            
            
        }
        
    }
}