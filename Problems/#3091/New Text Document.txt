class Solution {
    public int minOperations(int k) {
        int ans = k;
        for(int i = 1; i<=k; i++) ans = Math.min(ans,(k-1)/i+i-1);
        return ans;
    }
}

// solution: https://leetcode.com/CutSandstone/