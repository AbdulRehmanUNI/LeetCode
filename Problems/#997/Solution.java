class Solution {
    public int findJudge(int N, int[][] trust) {
        int[] trustOthers = new int[N + 1];
        int[] trustedByOthers = new int[N + 1];

        for (int[] pair : trust) {
            trustOthers[pair[0]]++;
            trustedByOthers[pair[1]]++;
        }

        for (int i = 1; i <= N; i++) {
            if (trustOthers[i] == 0 && trustedByOthers[i] == N - 1) {
                return i;
            }
        }

        return -1;
    }
}