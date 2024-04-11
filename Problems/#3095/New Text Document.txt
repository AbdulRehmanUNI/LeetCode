public class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        int l = 0, r = 0, sum = 0;
        int ans = Integer.MAX_VALUE;

        while (r < nums.length) {
            sum += nums[r++];
            while (sum >= k) {
                ans = Math.min(ans, r - l);
                sum -= nums[l++];
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
