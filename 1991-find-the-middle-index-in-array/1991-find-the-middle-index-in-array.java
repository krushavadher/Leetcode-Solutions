class Solution {
    public int findMiddleIndex(int[] nums) {
        int n=nums.length;
        int sum=0;
        int left=0;
        for(int num:nums)sum+=num;

        for(int i=0;i<n;i++){

           int right=sum-left-nums[i];
           if(left==right)return i;
           left+=nums[i];
        }
        return -1;
    }
}