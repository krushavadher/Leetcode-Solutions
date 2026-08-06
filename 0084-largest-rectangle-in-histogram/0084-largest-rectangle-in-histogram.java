class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st=new Stack<>();

        int max=-1;
        int n=heights.length;
        for(int i=0;i<heights.length;i++){

            while(!st.isEmpty() && heights[st.peek()]>heights[i]){
                int height=heights[st.pop()];
                int right=i;
                int left=st.isEmpty()?-1:st.peek();
                int width=right-left-1;
                int area=height*width;
                max=Math.max(max,area);

            }
            st.push(i);
        }
           while(!st.isEmpty()){
                int height = heights[st.pop()];
                int right=n;
                int left=st.isEmpty()?-1:st.peek();
                int width=right-left-1;
                int area=height*width;
                max=Math.max(max,area);
           }
        
        return max;


    }
}