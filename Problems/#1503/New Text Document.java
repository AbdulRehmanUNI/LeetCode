class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        Arrays.sort(left);
        Arrays.sort(right);
        int minRight= right.length==0 ?n:right[0],maxLeft=left.length==0?0:left[left.length-1];
        return Math.max(maxLeft,n-minRight); 
    }
}