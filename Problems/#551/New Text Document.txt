class Solution {
    public boolean checkRecord(String s) {
        int late=0, absent=0;
        for(char c: s.toCharArray()){
            if(c=='A') absent++;
            if(c=='L') late++;
            else late=0;
            if(absent>1 || late>=3) return false;
        }
        return true;
        
    }
}