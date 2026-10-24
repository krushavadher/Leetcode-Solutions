class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set=new HashSet<>(wordList);

        if(!set.contains(endWord))return 0;

        Queue<String> q=new LinkedList<>();
     
        Set<String> visited=new HashSet<>();

        q.add(beginWord);
        int change=1;
        while(!q.isEmpty()){

            int size=q.size();
            for(int i=0;i<size;i++){
                String word=q.poll();
                if(word.equals(endWord))return change;

                for(int j=0;j<word.length();j++){
                    for(int k='a';k<='z';k++){
                        char[] arr=word.toCharArray();
                        arr[j]=(char)k;

                        String n=new String(arr);

                        if(set.contains(n) && !visited.contains(n)){
                            visited.add(n);
                            q.add(n);
                        }
                    }
                }
            }

            ++change;

        }
        return 0;
    }
}