class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st=new Stack<>();
        Stack<Character> st2=new Stack<>();


        for(char ch:s.toCharArray()){
            if(Character.isLetter(ch)){
                st.push(ch);
            }
            else{
                if(!st.isEmpty()){
                    st.pop();
                }

            }
        }
        for(char ch:t.toCharArray()){
            if(Character.isLetter(ch)){
                st2.push(ch);
            }
            else{
                if(!st2.isEmpty()){
                    st2.pop();
                }

            }
        }
        
            StringBuilder sb=new StringBuilder();
            StringBuilder sb2=new StringBuilder();

            while(!st.isEmpty()){
                sb.append(st.pop());
            }
            while(!st2.isEmpty()){
                sb2.append(st2.pop());
            }
            return sb2.toString().equals(sb.toString());
            
        
    }
}