def eraseOverlapIntervals(intervals):
   if len(intervals) == 1:
       return 0
   mid = len(intervals) // 2
   left = intervals[:mid]
   right = intervals[mid:]
   left_removed = eraseOverlapIntervals(left)
   right_removed = eraseOverlapIntervals(right)
   return left_removed + right_removed
