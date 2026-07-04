class Solution {
    public String sortVowels(String s) {
        StringBuilder sb=new StringBuilder();
        ArrayList<Character> l=new ArrayList<>();
        String vow="aeiouAEIOU";

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(vow.indexOf(ch)!=-1){
                l.add(ch);

            }
        }
        Collections.sort(l);
        int idx=0;
        for(char ch:s.toCharArray()){
            if(vow.indexOf(ch)!=-1){
                sb.append(l.get(idx));
                idx++;
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}