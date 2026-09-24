class Solution {
    public List<String> topKFrequent(String[] words, int k) {

        HashMap<String,Integer> freq=new HashMap<>();

        for(String s:words){
            freq.put(s,freq.getOrDefault(s,0)+1);
        }
        PriorityQueue<String> pq=new PriorityQueue<>((a,b)->{
            if(freq.get(a).equals(freq.get(b))){
                return b.compareTo(a);
            }
            return freq.get(a)-freq.get(b);
        });

        for(String s:freq.keySet()){
            pq.add(s);

            if(pq.size()>k){
                pq.remove();
            }
        }

        ArrayList<String> ls=new ArrayList<>();

        while(!pq.isEmpty()){
            ls.add(pq.poll());
        }
        Collections.reverse(ls);
        return ls;

        
    }
}