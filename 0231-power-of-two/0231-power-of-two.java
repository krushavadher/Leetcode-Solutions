class Solution {
    public boolean isPowerOfTwo(int n) {
       if(n==1)return true;
       return check(n);
        
    }
    boolean check(int n){
        
        if(n==1)return true;
        if(n%2!=0 || n<1)return false;
        return check(n/2); 
    }
}