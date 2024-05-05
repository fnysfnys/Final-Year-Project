class Solution {
  public int eraseOverlapIntervals(int[][] intervals) {
    int n = intervals.length;
    UnionFind uf = new UnionFind(n);
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (isOverlapping(intervals[i], intervals[j])) {
          uf.union(i, j);
        }
      }
    }
    int components = uf.components();
    return n - components;
  }
}