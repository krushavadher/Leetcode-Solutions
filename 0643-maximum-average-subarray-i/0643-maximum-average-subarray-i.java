class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i=0;
        double sum=0;
        double max=Double.NEGATIVE_INFINITY;
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
            if(j-i+1==k){
                double avg=sum/(double)k;
                max=Math.max(max,avg);
                sum-=nums[i];
                i++;
            }

        }
        return max;
    }
}