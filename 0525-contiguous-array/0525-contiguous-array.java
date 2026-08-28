class Solution {
    public int findMaxLength(int[] nums) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0;
        int sum=0;
        int i=0;
        map.put(0,-1);
        for(int j=0;j<nums.length;j++){
            if(nums[j]==0){
                sum--;
            }
            else{
                sum++;
            }
            if(map.containsKey(sum)){
                max=Math.max(j-map.get(sum),max);
            }
         
               else{
                 map.put(sum,j);
               }
            
            
        }
        return max;
    }
}