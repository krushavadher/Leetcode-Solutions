class Solution {
    public int longestSubarray(int[] nums) {
        int zero=0;

        int ans=Integer.MIN_VALUE;

        int i=0;
        for(int j=0;j<nums.length;j++){

            if(nums[j]==0)zero++;

            while(zero>1){
                if(nums[i]==0){
                    zero--;
                }
                i++;
            }
            ans=Math.max(ans,j-i);
        }
        return ans;
    }
}