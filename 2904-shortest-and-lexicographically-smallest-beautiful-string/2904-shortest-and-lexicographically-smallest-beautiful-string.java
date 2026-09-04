class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        
        int st=-1;
        int i=0;
        int e=-1;
        int c=0;
        int ans=Integer.MAX_VALUE;

        for(int j=0;j<s.length();j++){

            char ch=s.charAt(j);

            if(ch=='1'){
                c++;
            }
            
            while(c>=k){
               int len=j-i+1;
               if((ans>len) || (ans==len && s.substring(i,j+1).compareTo(s.substring(st,e+1))<0)){
                ans=j-i+1;
                 st=i;
                 e=j;
               }
                if(s.charAt(i)=='1')c--;

                i++;
            }

        }
        return (st==-1)?"":s.substring(st,e+1);
    }
    
}