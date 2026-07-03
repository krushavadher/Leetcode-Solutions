class Solution {
    public String interpret(String command) {
        int n=command.length();
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<n){
            if(i==n-1 && command.charAt(i)==')'){
                i++;
                continue;
            }
            char ch1=command.charAt(i);
            if(ch1=='G'){
                sb.append(ch1);
                i++;
            }
            else if(ch1=='('){
                if(command.charAt(i+1)==')'){
                    sb.append('o');
                    i+=2;
                }
                else{
                    sb.append('a');
                    sb.append('l');
                    i+=3;
                }
            }
            else{
                i++;
            }
        }
        return sb.toString();
    }
}