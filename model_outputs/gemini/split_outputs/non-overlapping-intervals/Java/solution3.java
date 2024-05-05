public int eraseOverlapIntervals(int[][] intervals) {
  PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);
  int active = 0, count = 0;
  for (int[] interval : intervals) {
    pq.offer(interval);
  }
  while (!pq.isEmpty()) {
    int[] curr = pq.poll();
    active++;
    while (!pq.isEmpty() && pq.peek()[0] <= curr[1]) {
      count++;
      pq.poll();
    }
    active--;
  }
  return count;
}
