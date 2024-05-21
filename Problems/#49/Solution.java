class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String word : strs) {
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String sortedWord = new String(arr); 
            if (!map.containsKey(sortedWord)) map.put(sortedWord, new ArrayList<>());
            map.get(sortedWord).add(word);
        }
        List<List<String>> ans = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) ans.add(entry.getValue());
        return ans;
    }
}
