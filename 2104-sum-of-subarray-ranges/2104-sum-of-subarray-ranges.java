class Solution {
    public long subArrayRanges(int[] arr) {
        long sum=0;
        for(int i=0;i<arr.length;i++){

            long min=(long)arr[i];
            long max=(long)arr[i];
            for(int j=i;j<arr.length;j++){
                max=Math.max(max,arr[j]);
                min=Math.min(min,arr[j]);

                sum+=max-min;
            }

        }
        return sum;


    }
}