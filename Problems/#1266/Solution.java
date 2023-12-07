class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int ans=0;

        for(int i=0; i<points.length-1; i++){
            int sx=points[i][0], sy=points[i][1], fx=points[i+1][0], fy=points[i+1][1];
            ans+=Math.max(Math.abs(fx-sx), Math.abs(fy-sy));
        }
        return ans;
    }
}