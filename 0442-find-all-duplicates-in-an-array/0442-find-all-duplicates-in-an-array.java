class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int i=0;
        int n=nums.length;
        while(i<n){
            
                if(nums[i]!=nums[nums[i]-1]){
                   int temp=nums[nums[i]-1];
                    nums[nums[i]-1]=nums[i];
                    nums[i]=temp;
                }
               else{
                    i++;
               }
        }
           
        for(int id=0;id<nums.length;id++){
            if(nums[id]!=id+1){
                ans.add(nums[id]);
            }
        }
        

        
        return ans;
    }
}