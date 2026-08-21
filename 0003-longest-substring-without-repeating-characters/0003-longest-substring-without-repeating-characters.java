class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        boolean[] freq=new boolean[128];

        int i=0;
        int ans=0;

        for(int j=0;j<s.length();j++){

            while(freq[s.charAt(j)]){
                freq[s.charAt(i)]=false;
                i++;
            }
            freq[s.charAt(j)]=true;

            ans=Math.max(ans,j-i+1);
        }
        return ans;
    }
}