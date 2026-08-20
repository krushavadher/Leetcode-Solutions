class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> num1=new ArrayList<>();
        ArrayList<Integer> num2=new ArrayList<>();
        num1.add(nums[0]);
        num2.add(nums[1]);

        for(int i=2;i<nums.length;i++){
            int num=nums[i];
            if(num1.get(num1.size()-1)>num2.get(num2.size()-1)){
                num1.add(num);
            }
            else{
                num2.add(num);
            }
        }
        int[] ans=new int[num1.size()+num2.size()];
        int idx=0;
        for(int num:num1){
            ans[idx++]=num;
        }
        for(int num:num2){
            ans[idx++]=num;
        }
        return ans;

    }
}