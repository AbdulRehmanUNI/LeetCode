class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (set.contains(i)) ans[0] = i;
            set.add(i);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                ans[1] = i;
                break;
            }
        }
        return ans;
    }
}