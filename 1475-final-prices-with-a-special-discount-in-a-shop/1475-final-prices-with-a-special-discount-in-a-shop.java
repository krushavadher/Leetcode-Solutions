class Solution {
    public int[] finalPrices(int[] prices) {
        int n=prices.length;
        Stack<Integer> st=new Stack<>();
        int[] pre=new int[n];
        
        for(int i=n-1;i>=0;i--){
            int num=prices[i];
            while(!st.isEmpty() && st.peek()>num){
                st.pop();
            }
            if(st.isEmpty()){
                pre[i]=num;
            }
            else{
                pre[i]=num-st.peek();
            }

            st.push(num);
        }
        return pre;
        

    }
}