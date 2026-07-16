class Solution {
    long gcd(long a,long b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public long gcdSum(int[] nums) {
        int n=nums.length;
        long[] pre=new long[n];
        long max=-1;
        int i=0;
        for(int num:nums){
            max=Math.max((long)num,max);
            pre[i++]=gcd(max,(long)num);
        }

        Arrays.sort(pre);
        long sum=0;
        int s=0;
        int e=n-1;

        while(s<e){
            long g=gcd(pre[s],pre[e]);
            sum+=g;
            s++;
            e--;
        }

        return sum;


    }
}