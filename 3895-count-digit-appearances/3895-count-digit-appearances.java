class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            String s=String.valueOf(nums[i]);
            for(int j=0;j<s.length();j++){
                char ch=s.charAt(j);
                if(ch-'0'==digit){
                    count++;
                }
            }
        }
        return count;
    }
}