class Solution {
    public int numJewelsInStones(String jewels, String stones) {
     
        int count=0;
        HashMap<Character,Integer> map=new HashMap<>();

        for(char ch:stones.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        
        for(char ch:jewels.toCharArray()){

            if(stones.indexOf(ch)!=-1){
                count+=map.get(ch);
            }
           

        }
         return count;

    }
}