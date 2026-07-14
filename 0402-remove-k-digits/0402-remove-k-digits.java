class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> st=new Stack<>();

        for(char ch:num.toCharArray()){
            int n=(int)(ch-'0');
            while(!st.isEmpty() && st.peek()>n && k>0){
                st.pop();
               
                k--;
            }
            
           
            st.push(n);
            
        
        }
        while(k>0 && !st.isEmpty()){
            st.pop();
            k--;
        }

        StringBuilder sb=new StringBuilder();
       
      
         
       
             for(int t:st){
                sb.append(t);
            }
        
            
           
            while(sb.length()>0 && sb.charAt(0)=='0'){
                sb.deleteCharAt(0);
            
            }
            if(sb.length()==0){
                return "0";
            }
       
        return sb.toString();
    }
}