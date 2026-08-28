class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> map=new HashMap<>();

        int sum=0;
        int c=0;
        map.put(0,1);
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];

            if(map.containsKey(sum-goal)){
                c+=map.get(sum-goal);
            }
            
            map.put(sum,map.getOrDefault(sum,0)+1);
           
        }
        return c;
    }
}