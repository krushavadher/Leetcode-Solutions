class Solution {
    public long sumAndMultiply(int n) {
        String s=String.valueOf(n);
        if(n==0){
            return 0;
        }
        StringBuilder sb=new StringBuilder();
        int sum=0;
        for(char ch:s.toCharArray()){
            if(ch-'0'!=0){
                sb.append(ch);
                sum+=ch-'0';
            }

        }
        long num=Long.parseLong(sb.toString());

        
        return (long)num*sum;
    }
}