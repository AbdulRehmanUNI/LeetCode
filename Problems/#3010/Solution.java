class Solution {
    public int minimumCost(int[] nums) {
        int ans=nums[0];
        Arrays.sort(nums,1,nums.length);
        return ans+nums[1]+nums[2];
        // by leetcode.com/uwi
    }
}