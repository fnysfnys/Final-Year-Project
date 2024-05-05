def eraseOverlapIntervals(intervals):
   intervals.sort(key=lambda x: x[0])
   removed = 0
   for i in range(len(intervals)):
       if intervals[i][1] > intervals[i+1][0]:
           removed += 1
           intervals[i+1][0] = intervals[i][1]
   return removed
