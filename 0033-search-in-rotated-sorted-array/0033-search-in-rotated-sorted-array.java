class Solution {
    int h(int[] nums,int t,int s,int e){
         if(s>e){
            return -1;

         }
         int mid=s+(e-s)/2;
         if(nums[mid]==t){
            return mid;
         }
         if(nums[s]<=nums[mid]){
            if(nums[s]<=t && nums[mid]>=t){
               return h(nums,t,s,mid-1);
            }
            else{
                return h(nums,t,mid+1,e);
            }

         }
         else {
            if(nums[mid]<=t && nums[e]>=t){
                return h(nums,t,mid+1,e);
            }
            else{
                return h(nums,t,s,mid-1);
            }
        }
        
    }
    public int search(int[] nums, int target) {
        return h(nums,target,0,nums.length-1);
    }
}