class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n=nums.length;

        int[] ans=new int[n];
        int i=0;
        int idx=0;
        long sum=0;
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
            if(j-k<0 || j>n){
                ans[idx++]=-1;
            }
            
            else {
                if(j-i+1==(2*k+1)){
                    int avg=(int)(sum/(2*k+1));
                    ans[idx++]=avg;
                    sum-=nums[i];
                    i++;
                }
                
            }
        }

        for(int j=idx;idx<n;j++){
            ans[idx++]=-1;
        }
        return ans;
    }
}