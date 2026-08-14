class Solution {
    public int countKDifference(int[] nums, int k) {
        int c=0;
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int num:nums){
            if(map.containsKey(num+k)){
                c+=map.get(num+k);   
            }
            if(map.containsKey(num-k)){
                c+=map.get(num-k);
            }
            
                map.put(num,map.getOrDefault(num,0)+1);
            
        }

        return c;
    }
}