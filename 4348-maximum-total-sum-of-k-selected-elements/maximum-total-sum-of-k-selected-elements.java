class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        int n=nums.length;
        int idx=0;
        int i=n-1;
        long sum=0;
        while(idx<k){
            if(mul>0){
                sum+=1L*mul*nums[i--];
                mul--;
            }
            else{
                sum+=nums[i--];
            }
            idx++;
        }
        return sum;
    }
}