class Solution:
    def sumOfPower(self, nums, k):
        n = len(nums)
        mod = 10**9 + 7
        dp = [[0] * (k + 1) for _ in range(n + 1)]
        dp[0][0] = 1
        for i in range(1, n + 1):
            for j in range(k + 1):
                dp[i][j] = dp[i - 1][j] * 2 % mod
                if j >= nums[i - 1]:
                    dp[i][j] = (dp[i][j] + dp[i - 1][j - nums[i - 1]]) % mod
        return dp[n][k]