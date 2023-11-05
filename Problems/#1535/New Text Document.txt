public class Solution {
    public int getWinner(int[] arr, int k) {
        int count = 0;
        int maxNum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
                count = 0;
            }
            if (++count == k) break;
        }
        return maxNum;
    }
}