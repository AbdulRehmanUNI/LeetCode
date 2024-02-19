class Solution {
    public boolean isPowerOfTwo(int n) {
        // return Integer.bitCount(n)==1;
        return Long.bitCount(n)==1;
        
    }
}