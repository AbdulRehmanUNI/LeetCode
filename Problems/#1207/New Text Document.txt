class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr)
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        HashSet<Integer> ans = new HashSet<>();
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if(ans.contains(entry.getValue())) return false;
            ans.add(entry.getValue());
        }
        return true;

    }
}