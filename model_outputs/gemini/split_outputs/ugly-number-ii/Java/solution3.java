public int nthUglyNumber(int n) {
  PriorityQueue<Integer> pq = new PriorityQueue<>();
  pq.offer(1);
  Set<Integer> seen = new HashSet<>();
  for (int i = 0; i < n - 1; i++) {
    int num = pq.poll();
    if (!seen.contains(num * 2)) {
      pq.offer(num * 2);
      seen.add(num * 2);
    }
    if (!seen.contains(num * 3)) {
      pq.offer(num * 3);
      seen.add(num * 3);
    }
    if (!seen.contains(num * 5)) {
      pq.offer(num * 5);
      seen.add(num * 5);
    }
  }
  return pq.poll();
}
