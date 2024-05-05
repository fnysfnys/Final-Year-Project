class Solution(object):
    def eraseOverlapIntervals(self, intervals):
        """
        Given an array of intervals intervals where intervals[i] = [starti, endi], return the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping.

        :type intervals: List[List[int]]
        :rtype: int
        """
        if not intervals:
            return 0
        
        intervals.sort(key=lambda x: x[1])
        n = len(intervals)
        dp = [1] * n
        
        for i in range(1, n):
            for j in range(i):
                if intervals[i][0] >= intervals[j][1]:
                    dp[i] = max(dp[i], dp[j] + 1)
        
        return n - max(dp)
