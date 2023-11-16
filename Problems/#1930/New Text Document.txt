class Solution {
    public int countPalindromicSubsequence(String s) {
        int res = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            int start = s.indexOf(c);
            int end = s.lastIndexOf(c);
            if (start > -1 && end > start) {
                boolean[] seen = new boolean[26];
                for (int i = start + 1; i < end; i++) 
                    seen[s.charAt(i) - 'a'] = true;
                for (boolean v : seen) {
                    if (v) res++;
                }
            }
        }
        return res;
    }
}
//some help form copilot 