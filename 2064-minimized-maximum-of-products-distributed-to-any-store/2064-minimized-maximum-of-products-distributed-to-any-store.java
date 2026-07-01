class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int s=1;
        int e=Integer.MAX_VALUE;
        int ans=0;

        while(s<=e){
            int mid=s+(e-s)/2;

            long count=0;

            for(int i=0;i<quantities.length;i++){
               count+=(long)Math.ceil((double)quantities[i]/(double)(mid));
            }
            if(count<=n){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;
    }
}