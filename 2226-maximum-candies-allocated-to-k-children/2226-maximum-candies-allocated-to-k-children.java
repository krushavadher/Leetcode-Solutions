class Solution {
    public int maximumCandies(int[] candies, long k) {
        int s=1;
        int e=Integer.MAX_VALUE;
        int ans=0;
        while(s<=e){
            int can=s+(e-s)/2;

            long n=0;
            for(int i=0;i<candies.length;i++){
                n+=(long)candies[i]/(double)can;
            }
            if(n>=k){
                ans=can;
                s=can+1;
            }
            else{
                e=can-1;
            }
        }
        return ans;

    }
}