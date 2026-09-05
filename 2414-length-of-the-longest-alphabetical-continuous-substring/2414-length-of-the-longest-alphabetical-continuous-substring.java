class Solution {
    public int longestContinuousSubstring(String s) {
        int c=0;
        int ans=0;
        int i=0;
        for(int j=0;j<s.length()-1;j++){
            char ch=s.charAt(j);
            char chr=s.charAt(j+1);

            if(chr-ch==1){
                
                c++;
                ans=Math.max(ans,c);

            }
            else{
                i++;
                c=0;
            }
        }
        return ans+1;
    }
}