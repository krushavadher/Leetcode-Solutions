class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map=new HashMap<>();
       
        int i=0;
        int max=Integer.MIN_VALUE;
        for(int j=0;j<fruits.length;j++){
            
            while(map.size()>2){
                map.put(fruits[i],map.get(fruits[i])-1);
                if(map.get(fruits[i])==0)map.remove(fruits[i]);
                i++;
                
            }
            map.put(fruits[j],map.getOrDefault(fruits[j],0)+1);

            if(map.size()==2){
                max=Math.max(j-i+1,max);
            }
        }

        return max==Integer.MIN_VALUE?fruits.length:max;
    }
}