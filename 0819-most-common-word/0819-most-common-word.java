class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        String[] s=paragraph.toLowerCase().split("[ !?',;.]+");
        Set<String> set=new HashSet();
        for(String t:banned){
            set.add(t);
        }
        HashMap<String,Integer> map=new HashMap<>();
        for(String word:s){
           if(!set.contains(word)){
                map.put(word,map.getOrDefault(word,0)+1);
           }
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