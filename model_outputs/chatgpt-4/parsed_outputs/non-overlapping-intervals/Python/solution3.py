class Solution(object):
    def eraseOverlapIntervals(self, intervals):
        intervals.sort()
        n = len(intervals)
        dp = [1] * n
        for i in range(1, n):
            for j in range(i):
                if intervals[j][1] <= intervals[i][0]:
                    dp[i] = max(dp[i], dp[j] + 1)
        return n - max(dp)
