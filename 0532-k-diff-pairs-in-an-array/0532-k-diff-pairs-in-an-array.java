class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int c=0;
        for(int key:map.keySet()){
            if(k==0){
                if(map.get(key)>=2){
                    c++;
                }
            }
            else{
                if(map.containsKey(key+k)){
                    c++;
                }
            }
        }
        return c;
    }
}