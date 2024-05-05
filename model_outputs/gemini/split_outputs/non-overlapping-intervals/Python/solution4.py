from intervaltree import IntervalTree

def eraseOverlapIntervals(self, intervals):
  tree = IntervalTree()
  count = 0
  for start, end in intervals:
    overlapping = tree.overlap(start, end)
    count += len(overlapping)
    tree.add((start, end))
  return count
