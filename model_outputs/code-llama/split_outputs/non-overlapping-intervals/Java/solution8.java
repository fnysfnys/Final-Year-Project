public int eraseOverlapIntervals(int[][] intervals) {
   int[][] dp = new int[intervals.length][];
   for (int i = 0; i < intervals.length; i++) {
       dp[i] = new int[2];
       dp[i][0] = intervals[i][0];
       dp[i][1] = intervals[i][1];
   }
   int count = 0;
   for (int i = 0; i < intervals.length; i++) {
       if (dp[i][0] <= dp[i + 1][0] && dp[i][1] >= dp[i + 1][1]) {
           count++;
       }
   }
   return count;
}
