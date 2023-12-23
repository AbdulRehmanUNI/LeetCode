class Solution {
    public int incremovableSubarrayCount(int[] nums) {
        int n = nums.length;
        int total = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int[] temp = new int[n - (j - i + 1)];
                int index = 0;
                for (int k = 0; k < n; k++) 
                    if (k < i || k > j) temp[index++] = nums[k];
                if (isStrictlyIncreasing(temp)) total++;
            }
        }
        return total;
    }

    private boolean isStrictlyIncreasing(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) if (nums[i] >= nums[i + 1]) return false;
        return true;
    }
}