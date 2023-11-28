class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;

        for(int i=0; i<accounts.length; i++){
            int num=0;
            for(int j=0; j<accounts[0].length; j++){
                num+=accounts[i][j];
            }
            if(num>max) max=num;
        }
        return max;
        
    } 
}
