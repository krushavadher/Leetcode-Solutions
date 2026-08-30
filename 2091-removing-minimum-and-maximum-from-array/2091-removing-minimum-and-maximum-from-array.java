class Solution {
    public int minimumDeletions(int[] nums) {
        Deque<Integer> dq=new ArrayDeque<>();
        Deque<Integer> dq2=new ArrayDeque<>();
        Deque<Integer> dq3=new ArrayDeque<>();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int num:nums){
            if(num>max){
                max=num;
            }
            if(num<min){
                min=num;
            }
        }

        for(int num:nums){
            dq.addLast(num);

        }
        for(int num:nums){
            dq2.addLast(num);
        }

         for(int num:nums){
            dq3.addLast(num);
        }

        int c1=0;
        int c2=0;
        int k=2;
        while(!dq.isEmpty()){
            if(k<=0){
                break;
            }
            else if( k>0 && (dq.peekFirst()==min || dq.peekFirst()==max )){
                k--;
                c1++;
                dq.removeFirst();
            }
            else{
                c1++;
                dq.removeFirst();
            }   
        }
        k=2;
        while(!dq2.isEmpty()){
             if(k<=0){
                break;
            }
            else if( k>0 && (dq2.peekLast()==min || dq2.peekLast()==max )){
                k--;
                c2++;
                dq2.removeLast();
            }
            else{
                c2++;
                dq2.removeLast();
            }
        }
        k=2;
        int c3=0;
        boolean flag=true;int first = -1;
        while(!dq3.isEmpty()){
            if(flag){
                c3++;
                if(dq3.peekFirst()==min || dq3.peekFirst()==max){
                    first=dq3.peekFirst();
                    k--;
                    flag=false;
                }
                else{
                    dq3.removeFirst();
                }
            }
            else{
                c3++;
                if(dq3.peekLast() == min || dq3.peekLast() == max){
                    if(dq3.peekLast()!=first){
                        dq3.removeLast();
                        k--;
                        break;
                    }
                }
                dq3.removeLast();
            }
        }

        return Math.min(c1,Math.min(c2,c3));
    }
}