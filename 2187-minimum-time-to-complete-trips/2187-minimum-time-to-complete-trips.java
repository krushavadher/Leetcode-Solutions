class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        
        long st=0;
        long e=time[0];
        for(int num:time){
            e=Math.min(e,num);
        }
        e*=totalTrips;
        long ans=0;

        while(st<=e){
            long mid=st+(e-st)/2;

            long t=0;
            for(int i=0;i<time.length;i++){
                t+=(double)mid/(double)time[i];

            }
            if(t>=totalTrips){
                ans=mid;
                e=mid-1;
            }else{
                st=mid+1;
            }
        }
        return ans;
    }
}