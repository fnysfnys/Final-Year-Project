function eraseOverlapIntervals(intervals) {
  intervals.sort((a, b) => a[0] - b[0]); // Sort by start time
  const n = intervals.length;
  const dp = new Array(n + 1).fill(0);
  for (let i = 1; i <= n; i++) {
    const prev = dp[i - 1];
    const prevNonOverlap = i - 2 >= 0 ? dp[i - 2] : 0;
    dp[i] = Math.max(prev, prevNonOverlap + 1); // Choose max between no removal and removing current
  }
  return n - dp[n];
}
