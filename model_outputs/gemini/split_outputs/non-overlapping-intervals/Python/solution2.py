def eraseOverlapIntervals(self, intervals):
  intervals.sort(key=lambda x: x[1])
  prev_end = intervals[0][1]
  count = 0
  for _, end in intervals[1:]:
    if prev_end <= end:
      count += 1
      prev_end = end
  return count
