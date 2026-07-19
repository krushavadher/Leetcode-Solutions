class Solution {
    public String smallestSubsequence(String s) {
        int[] freq=new int[26];

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch-'a']++;
        }
        Stack<Character> st=new Stack<>();
        boolean[] visited=new boolean[26];

        for(char ch:s.toCharArray()){
            freq[ch-'a']--;
            if(visited[ch-'a']){
                continue;
            }
            else{
                while(!st.isEmpty() && st.peek()>ch && freq[st.peek()-'a']>0 ){
                    visited[st.pop()-'a']=false;
                }
                
            }
            st.push(ch);
            visited[ch-'a']=true;
        }

        StringBuilder sb=new StringBuilder();
        for(char ch:st){
            sb.append(ch);
        }
        return sb.toString();
    }
}