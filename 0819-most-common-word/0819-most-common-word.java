class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        String[] s=paragraph.toLowerCase().split("[ !?',;.]+");
       
        HashMap<String,Integer> map=new HashMap<>();
        for(String word:s){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        for(String t:banned){
            map.remove(t);
        }

        String ans="";
        int max=0;
        for(String key:map.keySet()){
            if(map.get(key)>max){
                max=map.get(key);
                ans=key;
            }
        }
        return ans;
    }
}