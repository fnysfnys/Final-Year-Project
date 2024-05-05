public int eraseOverlapIntervals(int[][] intervals) {
   PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> a[0] - b[0]);
   for (int[] interval : intervals) {
       queue.add(interval);
   }
   int count = 0;
   while (!queue.isEmpty()) {
       int[] interval = queue.poll();
       if (interval[1] <= queue.peek()[0]) {
           count++;
       }
   }
   return count;
}
