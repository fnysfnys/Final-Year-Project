import java.util.Arrays;

public class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(b[0], a[0]));
        int count = 0, end = Integer.MAX_VALUE;
        for (int[] interval : intervals) {
            if (interval[1] <= end) {
                end = interval[0];
                count++;
            }
        }
        return intervals.length - count;
    }
}
