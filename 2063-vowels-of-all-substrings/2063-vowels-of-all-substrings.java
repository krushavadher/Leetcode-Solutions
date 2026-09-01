class Solution {
    public long countVowels(String word) {
        String vow="aeiou";
        int n=word.length();

        long c=0;
        for(int j=0;j<word.length();j++){
            char ch=word.charAt(j);
            if(vow.indexOf(ch)!=-1){
                c+=(long)(j+1)*(n-j);
            }
        }
        return c;
    }
}