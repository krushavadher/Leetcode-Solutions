class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
    
        int k=p.length();
        int[] freq=new int[26];
        int[] w=new int[26];

        for(char chr:p.toCharArray()){
            freq[chr-'a']++;
        }
        ArrayList<Integer> list=new ArrayList<>();
        
        int i=0;
        for(int j=0;j<s.length();j++){
            char ch=s.charAt(j);
            w[ch-'a']++;

            if(j-i+1==k){
                if(Arrays.equals(freq,w)){
                    list.add(i);
                }
                w[s.charAt(i)-'a']--;
                i++;
            }
        }
        return list;
    }
}