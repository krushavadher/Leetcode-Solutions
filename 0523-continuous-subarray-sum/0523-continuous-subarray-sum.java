class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int sum=0;
        for(int j=0;j<nums.length;j++){

            sum+=nums[j];
            int rem=sum%k;

            if(map.containsKey(rem)){
                if(j-map.get(rem)>=2){
                    return true;
                }
            }
            else{
                map.put(rem,j);
            }
            
        }
        return false;
    }
}