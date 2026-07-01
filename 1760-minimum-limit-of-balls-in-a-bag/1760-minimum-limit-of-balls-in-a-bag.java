class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int s=1;
        int e=Integer.MAX_VALUE;

        int ans=0;
        while(s<=e){
            int mid=s+(e-s)/2;

            int op=0;
            for(int i=0;i<nums.length;i++){
                op+=(nums[i]-1)/mid;
            }
            if(op<=maxOperations){
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