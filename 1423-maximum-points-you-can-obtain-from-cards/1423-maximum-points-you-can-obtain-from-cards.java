class Solution {
    public int maxScore(int[] cardPoints, int k) {
        
        int i=0;
        int min=Integer.MAX_VALUE;
        int n=cardPoints.length;
        int sum=0;
        int total=0;
        for(int num:cardPoints){
            total+=num;
        }

        for(int j=0;j<cardPoints.length;j++){

            sum+=cardPoints[j];

            if(j-i+1==n-k){

                min=Math.min(sum,min);
                sum-=cardPoints[i];
                i++;

            }
        }

        return (min==Integer.MAX_VALUE)?total:total-min;
    }
}