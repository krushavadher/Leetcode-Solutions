class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
   
        int i=0;
        if(nums.length<k)return 0;
        int min=Integer.MAX_VALUE;
        for(int j=0;j<nums.length;j++){

            if(j-i+1==k){
                min=Math.min(min,nums[j]-nums[i]);
                i++;
            } 
        }

        return min;


    }
}