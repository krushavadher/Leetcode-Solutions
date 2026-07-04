class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        char[] t={'G','M','P'};
        
        int c=0;
        
        int m=travel.length;
        for(char ch1:t){
            
            char target=ch1;
            int last=-1;
            for(int i=0;i<garbage.length;i++){
                String s=garbage[i];
                for(char ch:s.toCharArray()){
                    if(ch==target){
                        c++;
                        last=i;
                    }

                }
                
                
                
            }
            for(int i=0;i<last;i++){
                c+=travel[i];
            }

        }
        
        return c;
    }
}