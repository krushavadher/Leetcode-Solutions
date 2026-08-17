class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        int i=0;
        int j=0;

        char[] ch=s.toCharArray();
        int k=p.length();
        int c=0;

        int[] freq=new int[26];
        int[] w=new int[26];

        for(char chr:p.toCharArray()){
            freq[chr-'a']++;
        }
        ArrayList<Integer> list=new ArrayList<>();
        int n=ch.length;
        while(j<n){
            if(j-i+1<=k){
                w[ch[j]-'a']++;
                j++;
            }

            else{
                if(Arrays.equals(freq,w)){
                    list.add(i);
                }
                w[ch[i]-'a']--;
                i++;
                
            }
        }

        if(Arrays.equals(freq,w)){
            list.add(i);
        }
        return list;
    }
}