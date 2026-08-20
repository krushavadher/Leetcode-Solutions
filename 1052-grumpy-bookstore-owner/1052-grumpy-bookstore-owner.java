class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        
        int base=0;
        for(int i=0;i<customers.length;i++){
            if(grumpy[i]==0){
                base+=customers[i];
            }
        }

        int i=0;
        int max=0;
        int extra=0;

        for(int j=0;j<grumpy.length;j++){
            if(grumpy[j]==1){
                extra+=customers[j];

            }
            if(j-i+1==minutes){
                max=Math.max(max,extra);
                if(grumpy[i]==1){
                    extra-=customers[i];
                }
                i++;
            }
        }
        return max+base;
    }
}