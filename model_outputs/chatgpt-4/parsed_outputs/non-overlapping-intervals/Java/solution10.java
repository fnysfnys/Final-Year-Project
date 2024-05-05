import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.addAll(Arrays.asList(intervals));
        int end = Integer.MIN_VALUE, count = 0;
        while (!pq.isEmpty()) {
            int[] interval = pq.poll();
            if (interval[0] >= end) {
                end = interval[1];
            } else {
                count++;
            }
        }
        return count;
    }
}
