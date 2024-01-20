class Solution {
    public int minimumArrayLength(int[] nums) {
        int gcd = 0, count = 0;
        for (int i : nums)
            gcd = gcd(gcd, i);
        for (int i : nums)
            if (i == gcd)
                count++;
        return Math.max(1, (count + 1) / 2);
    }

    public int gcd(int a, int b) {
        if (a % b == 0)
            return b;
        return gcd(b, a % b);
    }
}