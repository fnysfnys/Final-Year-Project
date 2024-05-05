public int nthUglyNumber(int n) {
    PriorityQueue<Long> minHeap = new PriorityQueue<>();
    minHeap.offer(1L);

    for (int i = 1; i < n; i++) {
        long current = minHeap.poll();
        minHeap.offer(current * 2);
        minHeap.offer(current * 3);
        minHeap.offer(current * 5);
    }

    return minHeap.poll().intValue();
}
