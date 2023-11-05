class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int [][] ans=new int[image.length][image[0].length];

        for(int i=0; i<image.length; i++ ){
            for(int j=0; j<image[0].length; j++){
                if(image[i][image[0].length-j-1]==1) ans[i][j]=0;
                else ans[i][j]=1;
            }
        }
        return ans;
    }
}