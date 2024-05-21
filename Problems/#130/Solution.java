class Solution {
    public void solve(char[][] board) {
        int m = board.length, n = board[0].length;
        // Top row
        for(int j = 0; j < n; j++) if(board[0][j] == 'O') dfs(board, 0, j);
        // Bottom row
        for(int j = 0; j < n; j++) if(board[m - 1][j] == 'O') dfs(board, m - 1, j);
        // Left column
        for(int i = 0; i < m; i++) if(board[i][0] == 'O') dfs(board, i, 0);
        // Right column
        for(int i = 0; i < m; i++) if(board[i][n - 1] == 'O') dfs(board, i, n - 1);

        for(char[] row: board)
            for(int i = 0; i < row.length; i++) row[i]=row[i] =='#'?'O':'X';

    }

    public static void dfs(char[][] board, int i, int j){
        if (i < 0 || i == board.length || j < 0 || j == board[0].length) return;
        if (board[i][j] != 'O') return;
        board[i][j] = '#';
        dfs(board, i + 1, j);
        dfs(board, i - 1, j);
        dfs(board, i, j + 1);
        dfs(board, i, j - 1);
    }
}