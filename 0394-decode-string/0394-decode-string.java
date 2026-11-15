class Solution {
    public String decodeString(String s) {
        
       Stack<Character> st=new Stack<>();

       for(char ch:s.toCharArray()){
        if(ch==']'){
            String temp="";

            while(!st.isEmpty() && st.peek()!='['){
                temp+=st.pop();
            }

            st.pop();
            String n="";
            while(!st.isEmpty() && Character.isDigit(st.peek())){
                n+=st.pop();
            }
            String r=new StringBuilder(n).reverse().toString();


            int num=Integer.parseInt(r);
            String rev=new StringBuilder(temp).reverse().toString();
            String a="";
            for(int i=0;i<num;i++){
                a+=rev;
            }

            for(char c:a.toCharArray()){
                st.push(c);
            }
  
        }
        else{
            st.push(ch);
        }
       }

       String ans="";
       for(char ch:st){
        ans+=ch;
       }
       return ans;
    }
}