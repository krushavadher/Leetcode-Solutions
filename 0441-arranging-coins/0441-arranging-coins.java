class Solution {
    public int arrangeCoins(int n) {
        if(n==1)return 1;
        
        int i=1;
        int count=0;
        while(i<=n){
            n-=i;
            i++;
            count++;
        }
        return count;
    }
}