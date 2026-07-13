class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans=new ArrayList<>();
       
            String s="123456789";
            
            int l=String.valueOf(low).length();
            int h=String.valueOf(high).length();

            for(int i=l;i<=h;i++){

                for(int j=0;i+j<=s.length();j++){
                    int num=Integer.parseInt(s.substring(j,i+j));

                    if(num>=low && num<=high){
                        ans.add(num);
                    }
                }
            }
        return ans;
    }
}