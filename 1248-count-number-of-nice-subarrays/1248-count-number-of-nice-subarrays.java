class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atmostK(nums,k)-atmostK(nums,k-1);
    }
    int atmostK(int[] nums,int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        int num=0;
        int c=0;
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]%2!=0){
                num++;

            }
           while(num>k){
   
                if(nums[i]%2!=0){
                    num--;
                }
                i++;
           }

            c+=j-i+1;
           
        }

        return c;
    }
}