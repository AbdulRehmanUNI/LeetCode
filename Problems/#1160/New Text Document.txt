class Solution {
    public int countCharacters(String[] words, String chars) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for (char c: chars.toCharArray())
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        int ans = 0;
        for (String word : words) {
            HashMap<Character, Integer> wordCountMap = new HashMap<>();
            boolean canForm = true;
            for (char c: word.toCharArray()){
                wordCountMap.put(c, wordCountMap.getOrDefault(c, 0) + 1);
                if (wordCountMap.get(c) > charCountMap.getOrDefault(c, 0)) {
                    canForm = false;
                    break;
                }
            }
            if (canForm) ans += word.length();
        }
        return ans;
    }
}