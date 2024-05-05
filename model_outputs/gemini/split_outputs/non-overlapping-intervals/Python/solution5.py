def eraseOverlapIntervals(self, intervals):
  intervals.sort(key=lambda x: x[0])
  n = len(intervals)
  dp = [0] * (n + 1)
  for i in range(1, n + 1):
    prev_non_overlapping = 0
    for j in range(i):
      if intervals[j][1] <= intervals[i - 1][0]:
        prev_non_overlapping = max(prev_non_overlapping, dp[j])
    dp[i] = max(dp[i - 1], prev_non_overlapping + 1)
  return n - dp[-1]
