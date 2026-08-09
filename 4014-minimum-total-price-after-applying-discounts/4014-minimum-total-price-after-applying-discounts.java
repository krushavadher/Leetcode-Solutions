class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        double sum=0;
        Arrays.sort(prices);
        Arrays.sort(discounts);

        int n=prices.length;
        int m=discounts.length;

        int i=n-1;
        int j=m-1;
        while(i>=0 && j>=0){

            sum+=(double)(prices[i]*(100-discounts[j]))/(double)100;
            i--;
            j--;

        }
        while(i>=0){
            sum+=prices[i];
            i--;
        }
        return sum;


    }
}