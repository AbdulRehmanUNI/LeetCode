class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                int bestNextRow = matrix[i + 1][j];
                if (j > 0) bestNextRow = Math.min(bestNextRow, matrix[i + 1][j - 1]);
                if (j < n - 1) bestNextRow = Math.min(bestNextRow, matrix[i + 1][j + 1]);
                matrix[i][j] += bestNextRow;
            }
        }
        int ans = Integer.MAX_VALUE;
        for (int x : matrix[0]) ans = Math.min(ans, x);
        return ans;
    }
}