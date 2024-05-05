def eraseOverlapIntervals(intervals):
   removed = 0
   for i in range(len(intervals)):
       for j in range(i+1, len(intervals)):
           if intervals[i][1] > intervals[j][0]:
               removed += 1
               intervals[j][0] = intervals[i][1]
   return removed
