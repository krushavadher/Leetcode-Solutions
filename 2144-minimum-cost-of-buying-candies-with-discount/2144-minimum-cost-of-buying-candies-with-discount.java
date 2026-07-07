class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int i=cost.length-1;

        int total=0;
        while(i>=0){
            total+=cost[i];

            if(i-1>=0){
                total+=cost[i-1];
            }
            i-=3;
        }
        return total;
      
    }
}