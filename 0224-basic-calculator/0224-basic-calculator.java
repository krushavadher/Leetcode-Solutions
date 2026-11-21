class Solution {
    public int calculate(String s) {
        Stack<Integer> st=new Stack<>();
        int res=0;
        int sign=1;
        int curr=0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(Character.isDigit(ch)){
                curr=(curr*10)+(ch-'0');
            }
            else if(ch=='+'){
                res+=curr*sign;
                curr=0;
                sign=1;

            }else if(ch=='-'){
                res+=curr*sign;
                curr=0;
                sign=-1;
            }
            else if(ch=='('){
                st.push(res);
                st.push(sign);
                res=0;
                sign=1;
                curr=0;

            }else if(ch==')'){
                res+=curr*sign;
                curr=0;
                res*=st.pop();
                res+=st.pop();
            }
        }

        res+=sign*curr;
        return res;
    }
}