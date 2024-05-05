class Solution(object):
    def eraseOverlapIntervals(self, intervals):
        cnt = 0
        for i in range(len(intervals)):
            for j in range(i+1, len(intervals)):
                if intervals[i][1] > intervals[j][0] and intervals[i][0] < intervals[j][1]:
                    cnt += 1
                    break
        return cnt
