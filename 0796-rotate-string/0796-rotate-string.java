class Solution {
    public boolean rotateString(String s, String goal) {
        String c=s+s;

        if(s.length()!=goal.length()){
            return false;
        }

        if(c.indexOf(goal)!=-1){
            return true;
        }
        return false;
    }
}