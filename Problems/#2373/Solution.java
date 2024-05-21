class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] result = new int[n - 2][n - 2];
        for (int i = 0; i <= n - 3; i++) {
            for (int j = 0; j <= n - 3; j++) {
                result[i][j] = max(grid[i][j], grid[i + 1][j], grid[i + 2][j], grid[i][j + 1], grid[i + 1][j + 1], grid[i + 2][j + 1], grid[i][j + 2], grid[i + 1][j + 2], grid[i + 2][j + 2]);
            }
        }
        return result;
    }

    private int max(int... values) {
        int max = Integer.MIN_VALUE;
        for (int value : values) if (value > max) max = value;
        return max;
    }
}
