class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
      Arrays.sort(intervals, Comparator.comparingInt(x -> x[0]));
      int end = intervals[0][1], count = 0;
      for (int i = 1; i < intervals.length; i++) {
        if (intervals[i][0] < end) {
          count++;
          end = Math.min(end, intervals[i][1]);
        } else {
          end = intervals[i][1];
        }
      }
      return count;
    }
    
}
