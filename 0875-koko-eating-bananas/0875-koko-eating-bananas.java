class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int s=1;
        int e=Integer.MAX_VALUE;
        int ans=0;

        while(s<=e){
            int n=s+(e-s)/2;

            int totalhours=0;
            for(int i=0;i<piles.length;i++){
                long hour=(long)Math.ceil((double)piles[i]/(double)n);
                totalhours+=hour;
            }
            if(totalhours<=h){
                ans=n;
                e=n-1;
            }
            else{
                s=n+1;
            }
        }
        return ans;
    }
}