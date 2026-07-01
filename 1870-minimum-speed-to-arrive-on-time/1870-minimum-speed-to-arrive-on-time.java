class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int s=1;
        int e=Integer.MAX_VALUE;

        int ans=-1;
        if(hour<=dist.length-1) return -1;
        while(s<=e){
            int mid=s+(e-s)/2;
            double h=0;
            for(int i=0;i<dist.length-1;i++){
                h+=Math.ceil((double)dist[i]/mid);

            }
            h+=(double)dist[dist.length-1]/mid;
            if(h<=hour){
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