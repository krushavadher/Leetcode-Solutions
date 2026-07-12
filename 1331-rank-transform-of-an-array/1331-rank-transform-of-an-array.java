class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length;
        int[] temp=new int[n];
        for(int i=0;i<n;i++){
            temp[i]=arr[i];
        }
        Arrays.sort(temp);
        HashMap<Integer,Integer> map=new HashMap<>();
        int idx=0;
        for(int num:temp){
            if(!map.containsKey(num)){
                map.put(num,idx+1);
                idx++;
            }
        }
        
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=map.get(arr[i]);
        }
        return ans;

        
    }
}