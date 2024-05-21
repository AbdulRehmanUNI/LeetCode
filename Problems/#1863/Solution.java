class Solution {
    public int subsetXORSum(int[] nums) {
        return solve(0, nums, 0);
    }

    public int solve(int i, int[] nums, int xor) {
        if (i == nums.length)
            return xor;
        int include = solve(i + 1, nums, nums[i] ^ xor); // include
        int exclude = solve(i + 1, nums, xor); // exclude
        return include + exclude; 

    }
}