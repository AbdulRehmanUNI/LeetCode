class Solution {
    public int maximumLengthSubstring(String s) {
        int[] freq = new int[26];
        int left = 0, right = 0, maxLen = 0;

        while (right < s.length()) {
            char rightChar = s.charAt(right);
            freq[rightChar - 'a']++;

            while (test(freq)) {
                char leftChar = s.charAt(left);
                freq[leftChar - 'a']--;
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }

        return maxLen;
    }

    private boolean test(int[] freq) {
        for (int value : freq) {
            if (value > 2) {
                return true;
            }
        }
        return false;
    }
}