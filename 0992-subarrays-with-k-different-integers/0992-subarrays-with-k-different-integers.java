class Solution {

    public int subarraysWithKDistinct(int[] nums, int k) {
        return atmostK(nums,k)-atmostK(nums,k-1);  
    }

    int atmostK(int[] nums,int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        int c=0;
        int i=0;
        for(int j=0;j<nums.length;j++){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            while(map.size()>k){    
                map.put(nums[i],map.get(nums[i])-1);
                if(map.get(nums[i])==0){
                    map.remove(nums[i]);
                }
                i++;
            }
            c+=j-i+1;

        }
        
        return c;
    }
}