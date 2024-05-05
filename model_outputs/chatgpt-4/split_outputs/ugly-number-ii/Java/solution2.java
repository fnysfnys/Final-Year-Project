public int nthUglyNumber(int n) {
    if (n == 1) return 1;
    PriorityQueue<Long> pq = new PriorityQueue<>();
    pq.add(1L);
    for (int i = 1; i < n; i++) {
        long temp = pq.poll();
        while (!pq.isEmpty() && pq.peek() == temp) temp = pq.poll();

        pq.add(temp * 2);
        pq.add(temp * 3);
        pq.add(temp * 5);
    }
    return pq.poll().intValue();
}
