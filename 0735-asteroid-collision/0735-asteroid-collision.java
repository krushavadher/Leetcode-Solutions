class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for (int num : asteroids) {
            if (num > 0) {
                st.push(num);

            }

            else {


                    while (!st.isEmpty() && Math.abs(num) > st.peek() && st.peek()>0) {
                        st.pop();
                    }

                
                        boolean flag=false;
                        if(!st.isEmpty() && Math.abs(num) == st.peek() && st.peek()>0) {
                            st.pop();
                            flag=true;
                        }

                        if(st.isEmpty() && !flag){
                            st.push(num);
                        }

                        else if(!flag && (!st.isEmpty() && st.peek()<0) ){
                            st.push(num);
                        }

                        
            }


        }
        int[] arr=new int[st.size()];

        int idx=0;
        for(int num:st){
            arr[idx++]=num;
        }

        return arr;
    }
}