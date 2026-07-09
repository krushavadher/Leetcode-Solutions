class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();

        for(char ch:s.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }
            else{
                if(!st.isEmpty()){
                    char t=st.peek();
                    if((t=='(' && ch!=')') || (t=='[' && ch!=']') || (t=='{' && ch!='}') ){
                        return false;
                    }
                    st.pop();
                }
                else{
                    return false;
                }
                
            }
        }
        if(st.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}