from itertools import combinations

class Solution(object):
    def eraseOverlapIntervals(self, intervals):
        n = len(intervals)
        min_removal = float('inf')
        for k in range(n + 1):
            for subset in combinations(intervals, k):
                if all(subset[i][1] <= subset[i + 1][0] for i in range(len(subset) - 1)):
                    min_removal = min(min_removal, n - k)
        return min_removal
