class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans=new ArrayList<>();
      
      int n=nums.length;
      int max=Integer.MIN_VALUE;
      int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
        }
        for(int i=0;i<n;i++){
            min=Math.min(min,nums[i]);
        }


        for(int i=min;i<=max;i++){
            boolean flag=false;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==i){
                    flag=true;

                }

            }
            if(!flag)ans.add(i);
           
        }



      return ans;
    }
}