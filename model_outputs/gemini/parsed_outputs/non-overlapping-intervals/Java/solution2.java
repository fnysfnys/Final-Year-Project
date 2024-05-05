class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
      Arrays.sort(intervals, Comparator.comparingInt(x -> x[1]));
      int prevEnd = Integer.MIN_VALUE, count = 0;
      for (int[] interval : intervals) {
        if (interval[0] > prevEnd) {
          prevEnd = interval[1];
        } else {
          count++;
        }
      }
      return count;
    }
    
}
