class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        
        int i=0;
        int max=Integer.MIN_VALUE;
        int total=0;
        for(int j=0;j<s.length();j++){
            char ch1=s.charAt(j);
            char ch2=t.charAt(j);

            int diff=Math.abs(ch1-ch2);

            total+=diff;
            if(total>maxCost){
                total-=Math.abs(s.charAt(i)-t.charAt(i)); 
                i++;
            }

            max=Math.max(max,j-i+1);

            
        }
       
        return max;
    }
}