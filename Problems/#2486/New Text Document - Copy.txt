class Solution {
    public int appendCharacters(String s, String t) {
        int ans=t.length();
        for(int i=0, j=0; i<s.length(); i++){
            if(j==t.length()) return ans;
            if(s.charAt(i)==t.charAt(j)) {
                ans--;
                j++;
            }
        }
        return ans;   
    }
}