class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;


        int[] suffmin=new int[n];
        suffmin[n-1]=nums[n-1];

        for(int i=n-2;i>=0;i--){
            suffmin[i]=Math.min(suffmin[i+1],nums[i]);
        }
        int max=nums[0];
        for(int i=0;i<n;i++){
            max=Math.max(nums[i],max);
            if(max-suffmin[i]<=k){
                return i;
            }
        }
        return -1;

    }
}