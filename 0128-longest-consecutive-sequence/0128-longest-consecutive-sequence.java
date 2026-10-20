class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int c=0;
        int max=0;
        for(int num:nums){
            set.add(num);
        }
        for(int num:set){

           if(num==Integer.MIN_VALUE || !set.contains(num-1)){
            c=1;
            while(num!=Integer.MAX_VALUE && set.contains(num+1)){
                num=num+1;
                c++;
            }
            max=Math.max(c,max);
           }
        }
        return max;
    }
}