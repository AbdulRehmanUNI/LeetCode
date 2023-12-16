public class Solution {
    public int removeAlmostEqualCharacters(String word) {
        int operations = 0;
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            if (Math.abs(chars[i] - chars[i + 1]) <= 1) {
                operations++;
                if (i + 2 < chars.length) {
                    chars[i + 1] = (char) (chars[i + 2] + 2);
                } else {
                    chars[i + 1] = (char) (chars[i] + 2);
                }
            }
        }
        return operations;
    }
}