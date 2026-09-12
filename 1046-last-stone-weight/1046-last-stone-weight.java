class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : stones) {
            pq.add(num);
        }
        boolean flag=true;
        while (flag) {
            if (pq.size() == 0) {
                flag = false;
            } else if (pq.size() == 1) {
                flag = false;
            } else {

                int a = pq.poll();

                int b = pq.poll();

                if (a != b) {
                    int diff = a - b;
                    if (diff > 0) {
                        pq.add(diff);
                    }

                }
            }

        }
        return (pq.size()==0)?0:pq.poll();
    }
}