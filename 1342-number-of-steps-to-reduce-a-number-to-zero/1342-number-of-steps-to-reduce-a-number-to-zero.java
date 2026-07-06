class Solution {
    int h(int n,int c){
        if(n==0){
            return c;
        }
        if(n%2==0){
            return h(n/2,c+1);
        }
        else{
            return h(n-1,c+1);
        }
    }
    public int numberOfSteps(int num) {
        return h(num,0);
    }
}