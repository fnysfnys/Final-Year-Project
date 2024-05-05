class Solution(object):
    def eraseOverlapIntervals(self, intervals):
       removed = 0
       seen = set()
       for interval in intervals:
           if interval[1] in seen:
               removed += 1
           else:
               seen.add(interval[1])
       return removed
    
