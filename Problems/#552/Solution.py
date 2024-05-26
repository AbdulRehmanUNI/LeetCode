class Solution:
    def __init__(self):
        self.mod = 10**9 + 7
        self.dp = [[[-1 for _ in range(2)] for _ in range(3)] for _ in range(100005)]

    def solve(self, i, l, a, n):
        if l >= 3 or a >= 2:
            return 0
        if i >= n:
            return 1
        if self.dp[i][l][a] != -1:
            return self.dp[i][l][a]
        ans1 = self.solve(i + 1, 0, a, n)  # present
        ans2 = self.solve(i + 1, l + 1, a, n)  # late
        ans3 = self.solve(i + 1, 0, a + 1, n)  # absent
        self.dp[i][l][a] = (ans1 + ans2 + ans3) % self.mod
        return self.dp[i][l][a]

    def checkRecord(self, n: int) -> int:
        for i in range(n+1):
            for j in range(3):
                for k in range(2):
                    self.dp[i][j][k] = -1
        return self.solve(0, 0, 0, n)