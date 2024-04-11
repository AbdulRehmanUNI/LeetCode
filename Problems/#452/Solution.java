class Solution {
    public int findMinArrowShots(int[][] points) {
        boolean[] visited=new boolean[points.length];
        int ans=0;

        for(int i=0; i<points.length; i++){
            int num=points[i][1];
            for(int j=0; j<points.length; j++){
                if(visited[j]==false && points[j][0]<=num){
                    ans++;
                    visited[j]=true;
                }
            }
        }
        return ans;
        
    }
}