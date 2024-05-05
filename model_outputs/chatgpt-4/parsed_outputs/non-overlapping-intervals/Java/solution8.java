import java.util.Arrays;

public class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int[] dp = new int[intervals.length];
        Arrays.fill(dp, 1);
        for (int i = 1; i < intervals.length; i++) {
            dp[i] = dp[i - 1];
            int lo = 0, hi = i;
            while (lo < hi) {
                int mid = lo + (hi - lo) / 2;
                if (intervals[mid][1] <= intervals[i][0]) {
                    lo = mid + 1;
                } else {
                    hi = mid;
                }
            }
            if (lo > 0) {
                dp[i] = Math.max(dp[i], dp[lo - 1] + 1);
            }
        }
        return intervals.length - dp[intervals.length - 1];
    }
}
