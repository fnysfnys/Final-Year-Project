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
        left, right = 0, 1
        
        while right < len(intervals):
            if intervals[right][0] < intervals[left][1]:
                count += 1
                right += 1
            else:
                left = right
                right += 1
        
        return count
