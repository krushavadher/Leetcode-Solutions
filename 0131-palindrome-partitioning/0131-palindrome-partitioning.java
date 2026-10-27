class Solution {
    public List<List<String>> partition(String s) {

         List<List<String>> ans=new ArrayList<>();
        solve(0,s,new ArrayList<>(),ans);
       
        return ans;
        
    }
    void solve(int idx,String s,List<String> curr,List<List<String>> ans){

        if(idx==s.length()){
            ans.add(new ArrayList<>(curr));
            return ;
        }


        for(int i=idx;i<s.length();i++){
           String temp=s.substring(idx,i+1);
           if(isPalin(temp)){
            curr.add(temp);
            solve(i+1,s,curr,ans);
            curr.remove(curr.size()-1);
           }
        }
    }
    boolean isPalin(String s){
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