class Solution(object):
    def eraseOverlapIntervals(self, intervals):
        cnt = 0
        while True:
            overlap_count = [0] * len(intervals)
            for i in range(len(intervals)):
                for j in range(i+1, len(intervals)):
                    if intervals[i][1] > intervals[j][0] and intervals[i][0] < intervals[j][1]:
                        overlap_count[i] += 1
                        overlap_count[j] += 1
            max_overlap = max(overlap_count)
            if max_overlap == 0:
                break
            max_index = overlap_count.index(max_overlap)
            del intervals[max_index

]
            cnt += 1
        return cnt
