class Solution {
    public int countCompleteSubarrays(int[] nums) {
        
        Set<Integer> set=new HashSet<>();

        for(int num:nums){
            set.add(num);
        }

        return atmostK(nums,set.size())-atmostK(nums,set.size()-1);
        

    }

    int atmostK(int[] nums,int s){
        HashMap<Integer,Integer> map=new HashMap<>();
        int c=0;
        int i=0;
        for(int j=0;j<nums.length;j++){

            map.put(nums[j],map.getOrDefault(nums[j],0)+1);

            while(map.size()>s){
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