class Solution {
    public String reversePrefix(String s, int k) {
        

        StringBuilder sb=new StringBuilder();
        int n=k;
        while(k>0){
            char ch=s.charAt(k-1);
            sb.append(ch);
            k--;

        }
        for(int i=n;i<s.length();i++){
            char ch=s.charAt(i);
            sb.append(ch);
        }
        return sb.toString();
    }
}