class Solution(object):
    def eraseOverlapIntervals(self, intervals):
        intervals.sort(key=lambda x: x[1])
        result = []
        for interval in intervals:
            if not result or interval[0] >= result[-1][1]:
                result.append(interval)
        return len(intervals) - len(result)
