class Solution {
    public boolean isPalindrome(String s) {
        
        int st=0;
        int e=s.length()-1;

        while(st<e){

            while(st<s.length() && !Character.isLetterOrDigit(s.charAt(st))){
                st++;
            }

            while(e>0 && !Character.isLetterOrDigit(s.charAt(e))){
                e--;
            }
            if(st>e)return true;
            char first=Character.toLowerCase(s.charAt(st));
            char sec=Character.toLowerCase(s.charAt(e));

           if(first!=sec){
            return false;
           }
           else{
            st++;
            e--;
           }

        }
        return true;
    }
}