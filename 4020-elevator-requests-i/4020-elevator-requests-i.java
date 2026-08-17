class Solution {
    public int elevatorRequests(int n, int[] requests) {
        
        int prev=0;
        int sum=0;

        for(int i=0;i<requests.length;i++){
            sum+=Math.abs(requests[i]-prev);
            prev=requests[i];
        }

        return sum;
    }
}