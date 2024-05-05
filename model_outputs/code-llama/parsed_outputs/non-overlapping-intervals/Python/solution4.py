class Solution(object):
    def eraseOverlapIntervals(self, intervals):
       if len(intervals) == 1:
           return 0
       mid = len(intervals) // 2
       left = intervals[:mid]
       right = intervals[mid:]
       left_removed = self.eraseOverlapIntervals(left)
       right_removed = self.eraseOverlapIntervals(right)
       return left_removed + right_removed
    
