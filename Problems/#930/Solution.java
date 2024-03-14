class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int pre = 0, res = 0;
        freq.put(0, 1);
        for (int i : nums) {
            pre += i;
            res += freq.getOrDefault(pre - goal, 0);
            freq.put(pre, freq.getOrDefault(pre, 0) + 1);
        }
        return res;
    }
}
