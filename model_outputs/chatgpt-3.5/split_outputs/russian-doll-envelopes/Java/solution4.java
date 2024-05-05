public int maxEnvelopes(int[][] envelopes) {
    Arrays.sort(envelopes, (a, b) -> {
        if (a[0] == b[0]) {
            return b[1] - a[1];
        }
        return a[0] - b[0];
    });

    PriorityQueue<Integer> pq = new PriorityQueue<>();
    for (int[] envelope : envelopes) {
        pq.offer(envelope[1]);
        if (pq.size() > 1 && envelope[1] > pq.peek()) {
            pq.poll();
        }
    }

    return pq.size();
}
