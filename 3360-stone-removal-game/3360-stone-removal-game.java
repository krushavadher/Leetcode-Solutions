class Solution {
    public boolean canAliceWin(int n) {
        int amount=10;
        int c=0;

        while(n>=amount){
            n-=amount;
            amount--;
            c++;
        }

        if(c%2==0){
            return false;
        }
        return true;
    }
}