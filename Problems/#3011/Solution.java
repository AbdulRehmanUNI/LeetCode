class Solution {
    public boolean canSortArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (Integer.bitCount(nums[j]) == Integer.bitCount(nums[j + 1]) && nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < nums.length - 1; i++)
            if (nums[i] > nums[i + 1])
                return false;
        return true;
    }
}