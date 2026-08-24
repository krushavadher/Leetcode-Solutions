class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,Integer> map=new HashMap<>();
        HashMap<Integer,Integer> map2=new HashMap<>();

        ArrayList<Integer> ans1=new ArrayList<>();
        ArrayList<Integer> ans2=new ArrayList<>();

        for(int i=0;i<matches.length;i++){      
            if(!map.containsKey(matches[i][0])){
                map.put(matches[i][0],0);
            }
        }

        for(int i=0;i<matches.length;i++){
            if(map.containsKey(matches[i][1])){
                map.remove(matches[i][1]);
            }
        }
        for(int key:map.keySet()){
            ans1.add(key);
        }

        for(int i=0;i<matches.length;i++){      
            map2.put(matches[i][1],map2.getOrDefault(matches[i][1],0)+1);
        }
        for(int key:map2.keySet()){
            if(map2.get(key)==1){
                ans2.add(key);
            }
        }
        List<List<Integer>> ans=new ArrayList<>();
        Collections.sort(ans1);
        Collections.sort(ans2);
        ans.add(ans1);
        ans.add(ans2);

        return ans;

    }
}