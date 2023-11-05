class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int max_row=0, ones=0;

        for(int i=0; i<mat.length; i++){
            int temp=0;
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j]==1) temp++;
            }
             if(temp>ones){
                ones=temp;
                max_row=i;
            }
        }
        int []ans={max_row, ones};
        return ans;
    }
}