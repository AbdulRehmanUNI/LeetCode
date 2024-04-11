class Solution {
    public long countSubstrings(String s, char c) {
        long ans = 0;
        long count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == c) count++;
        }
        if (count == 0) return 0;
        ans += count;
        ans += count * (count - 1) / 2;

        return ans;
    }
}
