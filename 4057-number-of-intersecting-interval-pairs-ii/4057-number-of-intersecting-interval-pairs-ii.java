class Solution {
    public long countIntersectingIntervals(int[][] intervals) {

        int n=intervals.length;
        
        int[] st=new int[n];
        int[] end=new int[n];

        for(int i=0;i<n;i++){
            st[i]=intervals[i][0];
            end[i]=intervals[i][1];   
        }
        Arrays.sort(st);
        Arrays.sort(end);
        long ans=0;
        int a=0;

        for(int i=0;i<n;i++){

            while(a<n && end[a]<st[i]){
                a++;
            }
            ans+=i-a;
        }
        return ans;

        
    }
}