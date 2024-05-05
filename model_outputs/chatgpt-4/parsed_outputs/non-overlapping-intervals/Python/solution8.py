class Solution(object):
    def eraseOverlapIntervals(self, intervals):
        intervals.sort(key=lambda x: x[1])
        cnt, last_end = 0, intervals[0][1]
        for i in range(1, len(intervals)):
            if intervals[i][0] < last_end:
                cnt += 1
            else:
                last_end = intervals[i][1]
        return cnt
