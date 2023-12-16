class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int row = grid.length, col=grid[0].length;
        int[] onesRow=new int[row], onesCol=new int[col]; 
        int[][] ans = new int [row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    onesRow[i]++;
                    onesCol[j]++;
                }
            }
        }
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                ans[i][j] = onesRow[i] + onesCol[j] - (row-onesCol[j]) - (col-onesRow[i]);
            }
        }        
        return ans;
    }    
}







// time limit
// class Solution {
//     public int[][] onesMinusZeros(int[][] grid) {
//         int row = grid.length, col=grid[0].length;
//         int[][] ans = new int [row][col];

//         for(int i=0; i<row; i++){
//             for(int j=0; j<col; j++){
//                 ans[i][j]=test(grid,i,j);
//             }
//         }
//         return ans;
//     }
//     public int test(int[][] grid, int row, int col){
//         int onesRow=0, onesCol=0, zerosRow=0, zerosCol=0;
//         for(int i=0; i<grid.length; i++){
//             if(grid[i][col]==1) onesRow++;
//             else zerosRow++;
//         }
//         for(int i=0; i<grid[0].length; i++){
//             if(grid[row][i]==1) onesCol++;
//             else zerosCol++;
//         }
//         return onesRow + onesCol - zerosRow - zerosCol;
//     }
//}