class Solution {
    public int minSubarray(int[] nums, int p) {
       
       long total=0;
       HashMap<Long,Integer> map=new HashMap<>();
       map.put(0L,-1);
       long sum=0;
       for(int num:nums)total+=num;
        long target=total%p;
         if (target == 0) return 0;
        int ans=nums.length;
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
            long rem=sum%p;
            long need=(rem-target+p)%p;

            if(map.containsKey(need)){
                ans=Math.min(ans,j-map.get(need));
            }
            map.put(rem,j);
        }
        return ans==nums.length?-1:ans;

    }
}