class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingDouble(a -> (double) a[0] / a[1]));
        for (int i = 0; i < arr.length; i++) for (int j = i + 1; j < arr.length; j++) pq.offer(new int[] { arr[i], arr[j] });
        while (--k > 0) pq.poll();
        return pq.poll();
    }
}
