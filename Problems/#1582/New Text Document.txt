class Solution {
    public int numSpecial(int[][] mat) {
        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) 
                if (mat[i][j] == 1 && check(mat, i, j)) count++;
        }
        return count;
    }
    private boolean check(int[][] mat, int row, int col) {
        for (int i = 0; i < mat.length; i++) if (i != row && mat[i][col] == 1) return false;
        for (int j = 0; j < mat[0].length; j++) if (j != col && mat[row][j] == 1) return false;
        return true;
    }
}