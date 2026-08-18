class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        int[] freq=new int[26];
        for(char ch:s1.toCharArray()){
            freq[ch-'a']++;
        }
        int k=s1.length();
        int[] w=new int[26];
        int left=0;
        for(int right=0;right<s2.length();right++){
            char ch=s2.charAt(right);
            w[ch-'a']++;

            if(right-left+1==k){
                 if(Arrays.equals(freq,w)){
                    return true;
                 }
                else{
                    w[s2.charAt(left)-'a']--;
                    left++;
                }
            }
        }
        return false;

    }
}