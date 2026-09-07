class Solution {
    public int countRotations(String s, int k) {
        
        String c=s+s;
        int n=s.length();
        int tot=0;

        for(int i=0;i<s.length();i++){
            String t=c.substring(i,i+n);
            int cnt=0;
            for(int j=0;j<t.length()-1;j++){
                if(t.charAt(j)==t.charAt(j+1)){
                    cnt++;
                }
            }
            if(cnt==k){
                tot++;
            }
        }
        return tot;

    }
}