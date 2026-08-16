class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i=0;
        int j=0;
        int n=nums.length;

        if(n==1)return nums[0];
        double sum=0;
        double max=Double.NEGATIVE_INFINITY;

        while(j<n){
            
            if(j-i+1<=k){
                sum+=nums[j];
                j++;
            }

            else{
                double av=sum/(double)k;
                max=Math.max(av,max);
                sum-=nums[i];
                i++;
            }

        }

        double av=sum/(double)k;
        max=Math.max(av,max);
        return max;
    }
}