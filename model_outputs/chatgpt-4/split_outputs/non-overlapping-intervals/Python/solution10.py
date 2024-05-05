class Solution(object):
    def eraseOverlapIntervals(self, intervals):
        def custom_sort(interval):
            return interval[1], -interval[0]
        intervals.sort(key=custom_sort)
        cnt, end = 0, float('-inf')
        for s, e in intervals:
            if s >= end:
                end = e
            else:
                cnt += 1
        return cnt
