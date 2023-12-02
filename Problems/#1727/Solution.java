import java.util.*;

class Solution {
    public int largestSubmatrix(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[] height = new int[n];
        int maxArea = 0;

        for (int[] row : matrix) {
            // Update the histogram.
            for (int j = 0; j < n; j++) {
                height[j] = row[j] == 0 ? 0 : height[j] + 1;
            }

            // Sort the heights.
            int[] sortedHeight = height.clone();
            Arrays.sort(sortedHeight);

            // Calculate the maximum area.
            for (int j = 0; j < n; j++) {
                maxArea = Math.max(maxArea, sortedHeight[j] * (n - j));
            }
        }

        return maxArea;
    }
}