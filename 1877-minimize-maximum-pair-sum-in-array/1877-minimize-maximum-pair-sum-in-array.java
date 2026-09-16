class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);

        int max=-1;

        for(int i=0;i<nums.length/2;i++){
            int sum=nums[i]+nums[nums.length-i-1];
            max=Math.max(sum,max);
        }
        return max;
    }
}