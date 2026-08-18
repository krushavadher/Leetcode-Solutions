class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map= new HashMap<>();

        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        boolean flag=false;
        int c=0;
        for(char key:map.keySet()){
            if(map.get(key)%2!=0 && flag==false){
                c+=map.get(key);
                flag=true;
            }

            else if(map.get(key)%2==0){
                c+=map.get(key);
            }
            else{
                c+=map.get(key)-1;
            }
        }
        return c;
    }
}