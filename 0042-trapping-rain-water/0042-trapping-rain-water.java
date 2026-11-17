class Solution {
    public int trap(int[] height) {
        int n=height.length;

        int[] left=new int[n];
        int[] right=new int[n];
        Stack<Integer> st=new Stack<>();
        st.push(height[0]);

        for(int i=0;i<n;i++){
            if(height[i]>st.peek()){
                st.push(height[i]);
            }

            left[i]=st.peek();
        }
        st.clear();
        st.push(height[n-1]);
         for(int i=n-1;i>=0;i--){
            if(height[i]>st.peek()){
                st.push(height[i]);
            }

            right[i]=st.peek();
        }
        int ans=0;
        for(int i=0;i<n;i++){
            ans+=Math.min(left[i],right[i])-height[i];
        }
        return ans;



    }
}