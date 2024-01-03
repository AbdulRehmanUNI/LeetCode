class Solution {
    public void gameOfLife(int[][] board) {
        if(board == null || board.length == 0) return;
        int m = board.length, n = board[0].length;

        int[][] copy = new int[m][n];

        // Directions for the neighbors
        int[][] directions = {{0, 1}, {0, -1}, {1, -1}, {-1, 1}, {1, 1}, {-1, -1}, {1, 0}, {-1, 0}};

        // Create a copy of the original board
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                copy[row][col] = board[row][col];
            }
        }

        // Iterate through board cell by cell
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                int liveNeighbors = 0;

                // For each cell, iterate through its neighbors
                for (int[] direction : directions) {
                    int r = row + direction[0];
                    int c = col + direction[1];

                    // Check the validity of the neighboring cell and if it was originally a live cell
                    if ((r < m && r >= 0) && (c < n && c >= 0) && (copy[r][c] == 1)) {
                        liveNeighbors += 1;
                    }
                }

                // Rule 1 or Rule 3
                if ((copy[row][col] == 1) && (liveNeighbors < 2 || liveNeighbors > 3)) {
                    board[row][col] = 0;
                }
                // Rule 4
                if (copy[row][col] == 0 && liveNeighbors == 3) {
                    board[row][col] = 1;
                }
            }
        }
    }
}