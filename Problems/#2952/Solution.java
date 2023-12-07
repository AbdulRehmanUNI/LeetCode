class Solution {
    public int minimumAddedCoins(int[] coins, int target) {
        Arrays.sort(coins);
        int res = 0, reach = 0;
        for (int coin : coins) {
            while (coin > reach + 1 && target > reach) {
                reach += reach + 1;
                res++;
            }
            reach += coin;
            if (reach >= target) {
                return res;
            }
        }
        while (target > reach) {
            reach += reach + 1;
            res++;
        }
        return res;
    }
}