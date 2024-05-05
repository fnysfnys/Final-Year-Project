class Solution(object):
    def eraseOverlapIntervals(self, intervals):
        intervals.sort(key=lambda x: x[1])
        end, cnt = float('-inf'), 0
        for interval in intervals:
            if interval[0] >= end:
                end = interval[1]
            else:
                cnt += 1
        return cnt
