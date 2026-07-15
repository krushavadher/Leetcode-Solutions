class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int max=-1;
        for(int num:candies){
            max=Math.max(num,max);
        }
        List<Boolean> ans=new ArrayList<>();
        int n=candies.length;
        for(int i=0;i<n;i++){
            if(candies[i]+extraCandies>=max){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        return ans;
    }

}