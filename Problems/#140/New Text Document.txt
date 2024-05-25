class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> ans = new ArrayList<>();
        HashSet<String> set = new HashSet<>(wordDict);
        solve(0, s, set, new StringBuilder(), ans);
        return ans;
    }

    public void solve(int i, String s, HashSet<String> set, StringBuilder sb, List<String> ans) {
        if (i == s.length()) {
            ans.add(sb.toString().trim());
            return;
        }

        for (int j = i; j < s.length(); j++) {
            if (set.contains(s.substring(i, j + 1))) {
                int prevLen = sb.length();
                sb.append(s.substring(i, j + 1)).append(" ");
                solve(j + 1, s, set, sb, ans);
                sb.setLength(prevLen); // backtracking 
            }
        }
    }
}