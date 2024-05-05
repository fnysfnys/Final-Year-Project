function eraseOverlapIntervals(intervals) {
   let dp = new Array(intervals.length + 1).fill(0);
   for (let i = 1; i <= intervals.length; i++) {
       dp[i] = Math.max(dp[i - 1], intervals[i - 1][1]);
   }
   let removed = 0;
   for (let i = 1; i <= intervals.length; i++) {
       if (intervals[i - 1][0] <= dp[i]) {
           removed++;
       }
   }
   return removed;
}
