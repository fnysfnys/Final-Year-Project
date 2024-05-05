public int eraseOverlapIntervals(int[][] intervals) {
  IntervalTree tree = new IntervalTree();
  for (int[] interval : intervals) {
    tree.insert(interval[0], interval[1]);
  }
  return tree.queryOverlappingIntervals().size();
}

class IntervalTree {
  // ... tree implementation code
}
