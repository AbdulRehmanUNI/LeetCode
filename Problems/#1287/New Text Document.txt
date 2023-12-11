class Solution {
    public int findSpecialInteger(int[] arr) {
        HashMap<Integer, Integer> countMap=new HashMap<>();
        for(int num: arr) countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        int freq=(arr.length/4)+1;
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() >= freq) return entry.getKey();
        }
        return -1;        
    }
}