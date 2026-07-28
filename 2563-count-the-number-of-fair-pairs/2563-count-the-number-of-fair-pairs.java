class Solution {
    int ub(int[] arr,int s,int t){
        int low=s;
        int h=arr.length;

        while(low<h){
            int mid=low+(h-low)/2;

            if(arr[mid]>t){
                h=mid;
            }
            else{
                low=mid+1;
            }
           
        }
         return low;
    }
    public long countFairPairs(int[] nums, int lower, int upper) {
        long ans=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int left=ub(nums,i+1,lower-nums[i]-1);
            int right=ub(nums,i+1,upper-nums[i]);

            ans+=right-left;
        }
        return ans;
    }
}