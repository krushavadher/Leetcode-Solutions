class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int n=tokens.length;
        if(n==0){
            return 0;
        }
        int left=0;
        int right=n-1;
        int score=0;
        int maxscore=0;

        while(left<=right){
            if(power>=tokens[left]){
                power-=tokens[left];
                score++;
                maxscore=Math.max(maxscore,score);
                left++;
            }
            else if(score>0){
                
                score--;
               
                power+=tokens[right];
                right--;
            }else{
                break;
            }
        }
        return maxscore;
    }
}