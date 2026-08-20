class Solution {
    public int countGoodSubstrings(String s) {
        int[] freq=new int[26];
        int i=0;
        int c=0;

        for(int j=0;j<s.length();j++){
            char ch=s.charAt(j);

            freq[ch-'a']++;

            if(j-i+1==3){
                boolean flag=true;
                for(int k=0;k<26;k++){
                    if(freq[k]>1){
                        flag=false;
                        break;
                    }
                }
                freq[s.charAt(i)-'a']--;

                if(flag)c++;
                i++;
            }
        }
        return c;
    }
}