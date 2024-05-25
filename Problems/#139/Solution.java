class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        // HashSet<String> set = new HashSet<>(wordDict);
        // int[] dp=new int[s.length];

        // for(int i=0; i<s.length; i++){
        // for(int j=i; j<s.length; j++){

        // }
        // } // i want too far ..... then came back
        return dfs(0, s, new HashSet<>(wordDict), new Boolean[s.length()]);
    }

    public boolean dfs(int start, String s, HashSet<String> set, Boolean[] memo) {
        if (start == s.length())
            return true;
        if (memo[start] != null)
            return false; // basic memoization

        for (int end = start + 1; end < s.length(); end++) {
            if (set.contains(s.substring(start, end+1)) && dfs(end, s, set, memo))
                memo[end] = true;
        }
        return memo[start] = false;
    }
}