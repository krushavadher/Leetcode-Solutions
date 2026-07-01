class Solution {
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;
        int count=0;
        int n=nums.length;
        while(i<n && nums[i]<k){
            count++;
            i++;
        }
        return count;
    }
}