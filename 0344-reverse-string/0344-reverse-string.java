class Solution {
    public void reverseString(char[] s) {
        rev(s,0,s.length-1);
       

    }
    void rev(char[] s,int st,int e){
        if(st>e)return ;

        char temp=s[st];
        s[st]=s[e];
        s[e]=temp;

        rev(s,st+1,e-1);
    }
}