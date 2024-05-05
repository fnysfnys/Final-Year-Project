from heapq import heappush, heappop

def eraseOverlapIntervals(self, intervals):
  events = [(start, True) for start, _ in intervals] + [(end, False) for _, end in intervals]
  events.sort()
  active, count = 0, 0
  for time, is_start in events:
    if is_start:
      active += 1
    else:
      active -= 1
      if active > 0:
        count += 1
  return count
