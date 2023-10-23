class Solution {
    public boolean isPowerOfFour(int n) {
        //Math.log(4) = 1.3862943611198906;
        return  (Math.log(n)/1.3862943611198906)%1==0;
    }
}