public int eraseOverlapIntervals(int[][] intervals) {
   TreeMap<Integer, Integer> intervalMap = new TreeMap<>();
   for (int[] interval : intervals) {
       intervalMap.put(interval[0], interval[1]);
   }
   int count = 0;
   for (int i = 0; i < intervals.length; i++) {
       if (intervalMap.get(intervals[i][0]) > intervals[i][1]) {
           count++;
       }
   }
   return count;
}
