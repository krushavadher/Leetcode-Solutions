class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n;i<=n+10;i++){
            int num=i;
            int pro=1;
            while(num>0){
                pro*=num%10;
                num/=10;
            }

            if(pro%t==0){
                return i;
            }
        }
        return 0;
    }
}