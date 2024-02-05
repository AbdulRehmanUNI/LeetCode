class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j]=='.') continue;
                else if(!validate(board,i,j)) return false;
            }
        }
        return true;
    }
    public boolean validate(char[][] board, int row, int col){
        char num=board[row][col];
        for(int i=0; i<9; i++) if(board[row][i]== num && i!=col) return false;
        for(int i=0; i<9; i++) if(board[i][col]==num && i!=row) return false;
        
        int startRow = row / 3 * 3;
        int startCol = col / 3 * 3;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(board[i+startRow][j+startCol] == num && (i+startRow != row || j+startCol != col)) return false;
            }
        }
        return true;
    } 
}