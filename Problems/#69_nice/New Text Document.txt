class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0;
        int msb = (int) (Math.log(x) / Math.log(2));
        msb = msb >> 1; // divide by 2 to get the msb of sqrt(x)
        int a = 1 << msb, res = 0;
        while (a != 0) {
            if ((long) (res + a) * (res + a) <= x) res += a;
            a >>= 1;
        }
        return res;
    }
}