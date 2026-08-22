class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq=new int[26];
        int i=0;
        int ans=0;
        int maxfreq=0;
        for(int j=0;j<s.length();j++){
            
            char ch=s.charAt(j);
            freq[ch-'A']++;

            maxfreq=Math.max(freq[ch-'A'],maxfreq);

            while((j-i+1)-maxfreq>k){
                freq[s.charAt(i)-'A']--;
                i++;
            }

            ans=Math.max(j-i+1,ans);
        }
        return ans;
    }
}