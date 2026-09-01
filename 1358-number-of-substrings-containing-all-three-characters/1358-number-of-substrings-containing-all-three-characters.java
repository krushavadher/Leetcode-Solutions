class Solution {
    public int numberOfSubstrings(String s) {
        
        HashMap<Character,Integer> map=new HashMap<>();
        int i=0;
        int c=0;
        for(int j=0;j<s.length();j++){

            char ch=s.charAt(j);
             map.put(ch,map.getOrDefault(ch,0)+1);

            while(map.size()==3){
                c+=s.length()-j;
                char left=s.charAt(i);
                map.put(left,map.get(left)-1);
                if(map.get(left)==0){
                    map.remove(left);
                }

                i++;

            }
 
        }

        return c;
    }
}