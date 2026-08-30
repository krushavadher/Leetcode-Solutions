class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        
        int i=0;
        int sum=0;
        int c=0;

        for(int j=0;j<arr.length;j++){
            
            sum+=arr[j];
            if(j-i+1==k){
                if((sum/k)>=threshold){
                    c++;
                }
                sum-=arr[i];
                i++;
            }
        }
        return c;
    }
}