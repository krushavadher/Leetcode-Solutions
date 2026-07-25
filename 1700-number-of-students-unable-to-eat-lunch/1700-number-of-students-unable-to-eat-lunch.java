class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q=new LinkedList<>();

        for(int num:students){
            q.offer(num);
        }
        int n=sandwiches.length;
        int count=0;
        int i=0;
        while(!q.isEmpty() && count<q.size()){
            int student=q.poll();
            if(student==sandwiches[i]){
                i++;
                count=0;
            }
            else{
                q.offer(student);
                count++;
            }
        }
        return q.size();
    }
}