class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> map=new HashMap<>();

        for(String s:strs){

            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String t=String.valueOf(ch);

            if(!map.containsKey(t)){
                map.put(t,new ArrayList<>());
                map.get(t).add(s);
            }
            else{
                map.get(t).add(s);
            }
        }
        List<List<String>> ans=new ArrayList<>();

        for(String key:map.keySet()){
            List<String> temp=new ArrayList<>();
           
            List<String> g=map.get(key);
            for(String s:g){
                temp.add(s);
            }
            ans.add(temp);
        }
        return ans;
    }
}