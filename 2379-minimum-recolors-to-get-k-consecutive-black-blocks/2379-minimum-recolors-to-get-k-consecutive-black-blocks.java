class Solution {
    public int minimumRecolors(String blocks, int k) {
        
        int i=0;
        int min=Integer.MAX_VALUE;
        int w=0;

        for(int j=0;j<blocks.length();j++){

            if(blocks.charAt(j)=='W'){
                w++;
            }
            if(j-i+1==k){
                min=Math.min(min,w);
               
                if(blocks.charAt(i)=='W')w--;
                 i++;
            }
        }
        return min;
    }
}