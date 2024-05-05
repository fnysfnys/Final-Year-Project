public int eraseOverlapIntervals(int[][] intervals) {
   int[] sweepLine = new int[intervals.length];
   for (int i = 0; i < intervals.length; i++) {
       sweepLine[i] = intervals[i][0];
   }
   int count = 0;
   for (int i = 0; i < intervals.length; i++) {
       if (sweepLine[i] <= sweepLine[i + 1]) {
           count++;
       }
   }
   return count;
}
