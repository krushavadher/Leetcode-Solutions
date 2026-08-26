class Solution {
    public int longestSubstring(String s, int k) {
        if(s.length()<k)return 0;
       int[] freq=new int[26];

        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }

        for(int j=0;j<s.length();j++){

            char ch=s.charAt(j);
           

            if(freq[ch-'a']<k){
                return Math.max(longestSubstring(s.substring(0,j),k),longestSubstring(s.substring(j+1),k));
            }
  

        }
        return s.length();

    }
}