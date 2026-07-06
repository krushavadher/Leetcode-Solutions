class Solution {

    boolean palin(String t,int s,int e){
        if(s>e){
            return true;
        }
        if(t.charAt(s)!=t.charAt(e)){
            return false;
        }
        else{
            return palin(t,s+1,e-1);
        }
    }
    public boolean isPalindrome(String s) {
        int n=s.length();

        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                sb.append(ch);
            }
        }
        String t=sb.toString().toLowerCase();
        int st=0;
        int end=t.length()-1;

       return palin(t,st,end);
       
    }
}