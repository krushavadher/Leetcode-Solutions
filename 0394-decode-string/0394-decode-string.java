class Solution {
    public String decodeString(String s) {
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();

        for(char ch:s.toCharArray()){
            if(ch==']'){
                StringBuilder t=new StringBuilder();
                while(!st.isEmpty() && st.peek()!='['){
                    t.append(st.pop());                   
                }
                st.pop();
                StringBuilder num=new StringBuilder();
                while(!st.isEmpty() && Character.isDigit(st.peek())){
                    num.append(st.pop());
                }
                int n=Integer.parseInt(num.reverse().toString());       
                String temp=t.toString().repeat(n);  
                for(int i=temp.length()-1;i>=0;i--){
                    st.push(temp.charAt(i));
                }
            }

            else{
                st.push(ch);
            }

        }

        while(!st.isEmpty()){
            sb.append(st.pop());
        }

        return sb.reverse().toString();
    }
}