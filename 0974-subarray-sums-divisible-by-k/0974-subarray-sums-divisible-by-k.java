class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        
        int c=0;
        int sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
            int rem=((sum%k)+k)%k;
            if(map.containsKey(rem)){
                c+=map.get(rem);
            }
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        return c;
    }
}