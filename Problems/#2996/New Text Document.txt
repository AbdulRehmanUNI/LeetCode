class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];
        int lastNum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != lastNum + 1) break;
            sum += nums[i];
            lastNum = nums[i];
        }
        Arrays.sort(nums);
        for (int num : nums) {
            if (num == sum) sum++;
            else if (num > sum) break;
        }
        return sum;
    }
}