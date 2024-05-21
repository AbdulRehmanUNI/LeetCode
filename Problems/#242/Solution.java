class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] freq = new int[26];
        for(int i = 0; i < s.length(); i++) freq[s.charAt(i) - 'a']++;
        
        for(int i = 0; i < t.length(); i++) if(--freq[t.charAt(i) - 'a'] < 0) return false;
        
        return true;
    }
}


/// better latter 

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
    }
}