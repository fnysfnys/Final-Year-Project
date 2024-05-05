class Solution(object):
    def eraseOverlapIntervals(self, intervals):
        """
        Given an array of intervals intervals where intervals[i] = [starti, endi], return the minimum number of intervals you need to remove to make the rest of the intervals non

-overlapping.

        :type intervals: List[List[int]]
        :rtype: int
        """
        if not intervals:
            return 0
        
        intervals.sort(key=lambda x: x[1])
        count = 0
        
        def binary_search(end):
            left, right = 0, len(intervals)
            while left < right:
                mid = left + (right - left) // 2
                if intervals[mid][1] <= end:
                    left = mid + 1
                else:
                    right = mid
            return left
        
        end = intervals[0][1]
        
        for i in range(1, len(intervals)):
            if intervals[i][0] < end:
                count += 1
            else:
                end = intervals[i][1]
        
        return count
