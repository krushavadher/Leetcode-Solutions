class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int num:nums1){
            l1.add(num);
        }
        for(int num:nums2){
            if(l1.contains(num)){
                ans.add(num);
                l1.remove(Integer.valueOf(num));
            }

        }
        int idx=0;
        int[] res=new int[ans.size()];
        for(int num:ans){
            res[idx++]=num;
        } 
        return res;
      }
}