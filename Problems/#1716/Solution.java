class Solution {
    public int totalMoney(int n) {
        int total = 0, week = 0;
        for (int i = 0; i < n; i++) {
            if (i % 7 == 0) week++;
            total += week + (i % 7);
        }
        return total;
    }
}