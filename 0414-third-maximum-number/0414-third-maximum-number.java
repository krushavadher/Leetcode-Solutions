class Solution {
    public int thirdMax(int[] nums) {

        long first=Long.MIN_VALUE;
        long sec=first,third=first;
        

        for(int num:nums){
            if(num>first){
                third=sec;
                sec=first;
                first=num;
            }
            else if(num>sec && num<first){
                third=sec;
                sec=num;
            }
            else if(num>third && num<sec){
                third=num;
            }
        }
      
        if(third==Long.MIN_VALUE){
            return (int)first;
        }
        return (int)third;
    }
}