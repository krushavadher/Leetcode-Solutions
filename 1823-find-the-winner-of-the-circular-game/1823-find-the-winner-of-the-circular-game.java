class Solution {
    public int findTheWinner(int n, int k) {
        return h(n,k)+1;

    }
    public int h(int n,int k ){
        if(n==1)return 0;

        return (h(n-1,k)+k)%n;
    }
}