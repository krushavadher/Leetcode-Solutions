class Solution {
    public boolean validPalindrome(String s) {
        
        int st=0;
        int e=s.length()-1;

        while(st<e){
            if(s.charAt(st)==s.charAt(e)){
                st++;
                e--;
            }

            else{
                return ispalin( s,st+1, e) || ispalin(s,st,e-1); 
            }
        }
        return true;
    }

    boolean ispalin(String s,int st,int e){
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