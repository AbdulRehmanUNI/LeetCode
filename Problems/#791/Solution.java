class Solution {
    public String customSortString(String order, String s) {
        String ans="", remaining=""; 
        for(char c: order.toCharArray()){
            for(char ch: s.toCharArray()){
                if(c==ch) ans+=ch;
            }
        }
        for(char c: s.toCharArray()){
            if(ans.indexOf(c)<0) remaining+=c;
        }
        return ans+remaining;
        
    }
}