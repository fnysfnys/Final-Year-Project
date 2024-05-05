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
        
        def remove_intervals(prev_end, i):
            if i == 0:
                return 0
            
            if intervals[i][0] < prev_end:
                return min(remove_intervals(prev_end, i-1), 1 + remove_intervals(intervals[i][1], i-1))
            else:
                return remove_intervals(prev_end, i-1)
        
        return remove_intervals(intervals[0][1], len(intervals) - 1)