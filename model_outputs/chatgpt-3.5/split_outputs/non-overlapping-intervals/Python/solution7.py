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
        count = 0
        end_times = {}
        
        for interval in intervals:
            start, end = interval
            if start < end_times.get(start, -float('inf')):
                count += 1
            else:
                end_times[start] = end
        
        return count
