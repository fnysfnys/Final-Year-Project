class Solution(object):
    def eraseOverlapIntervals(self, intervals):
        intervals.sort(key=lambda x: x[1])
        end = float('-inf')
        non_overlapping = 0
        for start, curr_end in intervals:
            if start >= end:
                end = curr_end
                non_overlapping += 1
        return len(intervals) - non_overlapping
