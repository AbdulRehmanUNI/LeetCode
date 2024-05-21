class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long ans=0;
        int turn=0, idx=happiness.length-1;
        Arrays.sort(happiness);
        while(k-->0) {
            if(idx < 0 || happiness[idx] <= turn) break;
            ans += happiness[idx--] - turn++;
        }
        return ans;
    }
}
