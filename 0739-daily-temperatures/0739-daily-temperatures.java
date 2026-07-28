class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st=new Stack<>();
        int n=temperatures.length;
        int idx=n-1;
        int[] ans=new int[n];
        
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && temperatures[st.peek()]<=temperatures[i]){
                st.pop();
            }

            if(st.isEmpty()){
                ans[idx--]=0;
            }
            else{
                ans[idx--]=st.peek()-i;
            }
            st.push(i);
        }
        return ans;
    }
}