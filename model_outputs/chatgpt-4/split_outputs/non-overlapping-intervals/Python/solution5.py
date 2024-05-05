class Solution(object):
    def eraseOverlapIntervals(self, intervals):
        intervals.sort(key=lambda x: x[1])
        cnt, end = 0, float('-inf')
        for s, e in intervals:
            if s >= end:
                end = e
            else:
                cnt += 1
                if cnt > len(intervals) / 2:
                    break
        return cnt
