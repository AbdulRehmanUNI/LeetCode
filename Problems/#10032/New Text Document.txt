class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 2; --i) {
            long sum = 0;
            for (int j = 0; j < i; ++j) {
                sum += nums[j];
            }
            if (sum > nums[i]) {
                return sum + nums[i];
            }
        }
        return -1;
    }
}