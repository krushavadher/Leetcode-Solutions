class Solution {
    int st(int[] nums,int t,int s,int e){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(nums[m]==t){
            return m;
        }
        if(t<nums[m]){
            return st(nums,t,s,m-1);
        }
       
        return st(nums,t,m+1,e);
        
        
    }
    public int search(int[] nums, int target) {
        int ans=st(nums,target,0,nums.length-1);
        return ans;
    }
}