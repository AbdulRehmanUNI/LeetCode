class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

    for(int i=0; i<matrix.length; i++){
        int start = 0, end = matrix[i].length -1;
        for(int j=0; j<matrix[i].length; j++){
            int middle = (end - start)/2;
            if(matrix[i][j]==target) return true;
            else if(matrix[i][j]>target) end = middle -1;
            else start=middle+1;
        }
    }
     return false;
    }
}