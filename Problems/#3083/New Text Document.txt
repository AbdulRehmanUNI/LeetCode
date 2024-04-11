class Solution {
    public boolean isSubstringPresent(String s) {
        HashSet<String> map = new HashSet<>();
        String reverse = new StringBuilder(s).reverse().toString();
        for (int i = 0; i < s.length() - 1; i++) {
            String temp = s.substring(i, i + 2);
            map.add(temp);
        }
        for (int i = 0; i < reverse.length() - 1; i++) {
            String temp = reverse.substring(i, i + 2);
            if (map.contains(temp))
                return true;
        }
        return false;
    }
}