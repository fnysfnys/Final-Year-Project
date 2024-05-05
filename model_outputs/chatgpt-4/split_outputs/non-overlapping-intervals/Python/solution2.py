class Solution(object):
    def eraseOverlapIntervals(self, intervals):
        intervals.sort()
        prev_end = intervals[0][1]
        cnt = 0
        for start, end in intervals[1:]:
            if start < prev_end:
                cnt += 1
                prev_end = min(prev_end, end)
            else:
                prev_end = end
        return cnt
