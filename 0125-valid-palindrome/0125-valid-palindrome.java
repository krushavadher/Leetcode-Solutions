class Solution {
    public boolean isPalindrome(String s) {
        
       
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                sb.append(ch);
            }
        }
        int st=0;
        int e=sb.length()-1;
        if(s.length()==0 || sb.length()==0)return true;

        while(st<=e){

            char first=Character.toLowerCase(sb.charAt(st));
            char sec=Character.toLowerCase(sb.charAt(e));

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