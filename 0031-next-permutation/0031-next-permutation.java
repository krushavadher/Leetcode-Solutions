class Solution {
    public void nextPermutation(int[] nums) {
        
        int n=nums.length;
        int i=n-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        int pivot=i;

       if(i>=0){
         int j=n-1;
        while(nums[j]<=nums[pivot]){
            j--;
            
        }
        swap(nums,pivot,j);
       }
       rev(nums,pivot+1,n-1);    
    }
    void swap(int[] arr,int s,int e){
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
    }
    void rev(int[] arr,int s,int e){
        while(s<e){
            swap(arr,s,e);
            s++;
            e--;
        }
    }
}