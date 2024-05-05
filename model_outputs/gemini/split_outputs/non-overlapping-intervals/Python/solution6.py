def eraseOverlapIntervals(self, intervals):
  def solve(intervals):
    if not intervals:
      return 0
    mid = len(intervals) // 2
    left = solve(intervals[:mid])
    right = solve(intervals[mid:])
    merged = merge(intervals[:mid]) + merge(intervals[mid:])
    count = left + right + count_overlaps(merged)
    return min(count, left + solve(merge(intervals)))

  def merge(intervals):
    intervals.sort()
    merged = []
    prev_end = None
    for start, end in intervals:
      if prev_end is None or start > prev_end:
        merged.append([start, end])
      else:
        merged[-1][1] = max(merged[-1][1], end)
      prev_end = end
    return merged

  def count_overlaps(intervals):
    count = 0
    prev_end = None
    for _, end in intervals:
      if prev_end is not None and end > prev_end:
        count += 1
      prev_end = end
    return count

  return solve(intervals.copy())
