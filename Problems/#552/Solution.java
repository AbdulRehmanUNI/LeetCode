public class Solution {
    private static final int mod = 1000000007;
    private int[][][] dp = new int[100005][3][2];

    private int solve(int i, int l, int a, int n) {
        if (l >= 3 || a >= 2) {
            return 0;
        }

        if (i >= n) {
            return 1;
        }

        if (dp[i][l][a] != -1) {
            return dp[i][l][a];
        }

        long ans1 = solve(i + 1, 0, a, n); // present
        long ans2 = solve(i + 1, l + 1, a, n); // late
        long ans3 = solve(i + 1, 0, a + 1, n); // absent

        return dp[i][l][a] = (int)((ans1 + ans2 + ans3) % mod);
    }

    public int checkRecord(int n) {
        for (int[][] arr2D : dp) {
            for (int[] arr1D : arr2D) {
                Arrays.fill(arr1D, -1);
            }
        }
        return solve(0, 0, 0, n);
    }
}