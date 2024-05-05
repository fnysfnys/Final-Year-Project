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
        stack = [intervals[0]]
        
        for i in range(1, len(intervals)):
            if intervals[i][0] >= stack[-1][1]:
                stack.append(intervals[i])
        
        return len(intervals) - len(stack)