public int nthUglyNumber(int n) {
    if (n == 1) return 1;
    PriorityQueue<Long> pq = new PriorityQueue<>();
    HashSet<Long> set = new HashSet<>();
    pq.add(1L);
    set.add(1L);
    long number = 1;
    for (int i = 0; i < n; i++) {
        number = pq.poll();
        if (set.add(number * 2)) pq.add(number * 2);
        if (set.add(number * 3)) pq.add(number * 3);
        if (set.add(number * 5)) pq.add(number * 5);
    }
    return (int) number;
}
