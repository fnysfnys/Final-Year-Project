from bisect import bisect_right

class Solution(object):
    def eraseOverlapIntervals(self, intervals):
        intervals.sort()
        ends = [i[1] for i in intervals]
        dp = [1] * len(intervals)
        for i in range(1, len(intervals)):
            idx = bisect_right(ends, intervals[i][0], 0, i) - 1
            dp[i] = max(dp[i-1], dp[idx] + 1 if idx != -1 else 1)
        return len(intervals) - dp[-1]
