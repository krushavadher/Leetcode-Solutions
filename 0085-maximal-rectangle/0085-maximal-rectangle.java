class Solution {
    public int maximalRectangle(char[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;

        if(row==0){
            return 0;
        }
        int ans=0;
        int[] height=new int[col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]=='1'){
                    height[j]++;
                }
                else{
                    height[j]=0;
                }
            }
            ans=Math.max(ans,maxarea(height));
        }
        return ans;
    }

     int maxarea(int[] height){

        Stack<Integer> st=new Stack<>();
        int max=-1;
        for(int i=0;i<height.length;i++){
            while(!st.isEmpty() && height[st.peek()]>height[i]){
                int h=height[st.pop()];
                int r=i;
                int l=(st.isEmpty()?-1:st.peek());
                int w=r-l-1;
                max=Math.max(max,w*h);

            }
            st.push(i);

        }
        while(!st.isEmpty()){
            int h=height[st.pop()];

            int r=height.length;
            int l=(st.isEmpty()?-1:st.peek());
            int w=r-l-1;
            max=Math.max(max,w*h);
        }
        return max;

    }
}