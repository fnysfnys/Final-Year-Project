def eraseOverlapIntervals(self, intervals):
  intervals.sort(key=lambda x: x[0])
  prev_end = intervals[0][1]
  count = 0
  for start, end in intervals[1:]:
    if start >= prev_end:
      prev_end = end
    else:
      count += 1
      prev_end = min(prev_end, end)
  return count
