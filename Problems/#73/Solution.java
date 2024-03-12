class Solution {
    public void setZeroes(int[][] matrix) {
        List<Integer> m_s=new ArrayList<>();
        List<Integer> n_s=new ArrayList<>();
        int count=0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==0){
                    m_s.add(i);
                    n_s.add(j);
                    count++;
                }//if
            }//for
        }//for
        int temp=0;
        while(temp<count){
            int row=m_s.get(temp);
            int col=n_s.get(temp);
            temp++;
            for (int i = 0; i < matrix.length; i++) matrix[i][col] = 0; 
            for (int j = 0; j < matrix[0].length; j++)  matrix[row][j] = 0;
        }//while      
    }
}