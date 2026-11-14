class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> st=new Stack<>();

        for(char ch:num.toCharArray()){
            int n=ch-'0';
            
            while(!st.isEmpty() && st.peek()>n && k>0){
                st.pop();
                k--;
            }

            st.push(n);

        }

        while(k>0){
            st.pop();
            k--;
        }

        String ans="";

        for(int n:st){
            ans+=String.valueOf(n);
        }
        if(ans==""){
            return "0";
        }

        String a="";

        int i=0;
        while(i<ans.length() && ans.charAt(i)=='0' ){
            i++;
        }

        if(i>=ans.length()){
            return "0";
        }
        a=ans.substring(i);
       return a;


    }
}