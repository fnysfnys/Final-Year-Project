class Solution(object):
    def eraseOverlapIntervals(self, intervals):
        intervals.sort(key=lambda x: x[0])
        n = len(intervals)
        dp = [1] * n
        for i in range(n):
            for j in range(i):
                if intervals[i][0] >= intervals[j][1]:
                    dp[i] = max(dp[i], dp[j] + 1)
        return n - max(dp)
