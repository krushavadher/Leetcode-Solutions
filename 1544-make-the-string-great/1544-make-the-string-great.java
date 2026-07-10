class Solution {
    public String makeGood(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(st.isEmpty()){
                st.push(ch);
            }
            else if(Character.isUpperCase(ch) && Character.isLowerCase(st.peek())){
                if(Character.toLowerCase(ch)==st.peek()){
                    st.pop();
                }
                else{
                    st.push(ch);
                }
            }
            else if(Character.isUpperCase(st.peek()) && Character.isLowerCase(ch)){
                if(Character.toLowerCase(st.peek())==ch){
                    st.pop();
                }
                else{
                    st.push(ch);
                }
            }
            else{
                st.push(ch);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char ch:st){
            sb.append(ch);
        }
        return sb.toString();
    }
}