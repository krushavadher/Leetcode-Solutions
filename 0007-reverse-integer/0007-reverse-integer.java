class Solution {
    long helper(long n,int arg){
        if(n%10==n){
            return n;
        }
        long rem=n%10;
        return rem*(long)Math.pow(10,arg-1)+helper(n/10,arg-1);
    }
    public int reverse(int x) {
        long num=Math.abs((long)x);
        
        int digits=(int)Math.log10(num)+1;
        long ans=helper(num,digits);
        if(x<0){
            ans=-ans;
        }
        if(ans>Integer.MAX_VALUE || ans<Integer.MIN_VALUE){
            return 0;
        }
        return (int)ans;

    }
}