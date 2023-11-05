class Solution {
    public int findChampion(int[][] grid) {
        int winner=0,counter=0;

        for(int i=0; i<grid.length; i++){
            int temp=0;
            for(int j=0; j<grid.length; j++){
                if(i==j) continue;
                if(grid[i][j]==1) temp++;
            }
            if(temp>counter){ counter=temp; winner=i;} 
        }
        return winner;
    }
}

//by uwi from =====>>>      leetcode.com/uwi
// class Solution {
//     public int findChampion(int[][] grid) {
//         for(int i = 0;i < grid.length;i++){
//             int s = 0;
//             for(int j = 0;j < grid[0].length;j++){
//                 s += grid[i][j];
//             }
//             if(s == grid.length-1)return i;
//         }
//         return -1;
//     }
// }