class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        

        Stack<Integer> st=new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            if(asteroids[i]>0){
                st.push(asteroids[i]);
            }
            else{
                while(!st.isEmpty() && st.peek()>0 && Math.abs(asteroids[i])>st.peek()){
                    st.pop();
                }


                if(!st.isEmpty() && st.peek()>0 && Math.abs(asteroids[i])==st.peek()){
                    st.pop();
                }

                
                else if(st.isEmpty() || st.peek()<0){
                    st.push(asteroids[i]);
                }
            


                
            }
            
        }
        int idx=0;
        int[] arr=new int[st.size()];
       for(int num:st){
        arr[idx++]=num;
       }

        return arr;
    }
}