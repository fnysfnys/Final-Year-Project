public int eraseOverlapIntervals(int[][] intervals) {
  Arrays.sort(intervals, Comparator.comparingInt(x -> x[0]));
  int n = intervals.length;
  int[] dp = new int[n];
  dp[0] = 1;
  for (int i = 1; i < n; i++) {
    int maxPrev = 0;
    for (int j = 0; j < i; j++) {
      if (intervals[j][1] <= intervals[i][0]) {
        maxPrev = Math.max(maxPrev, dp[j]);
      }
    }
    dp[i] = maxPrev + 1;
  }
  return n - Arrays.stream(dp).max().getAsInt();
}
