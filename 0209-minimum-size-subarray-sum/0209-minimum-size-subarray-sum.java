class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
       int s=1;
       int e=nums.length;

       int ans=0;


        while(s<=e){

            int mid=s+(e-s)/2;

            int sum=0;
            int i=0;
            int t=0;
            for(int j=0;j<nums.length;j++){
                sum+=nums[j];
                if(j-i+1==mid){

                    if(sum>=target){
                        t=mid;
                    }
                    sum-=nums[i];
                    i++;
                    
                }

            }

            if(t!=0){
                ans=t;
                e=mid-1;

            }
            else{
                s=mid+1;
            }
        }

        return ans;

        
    }
}