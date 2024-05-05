import java.util.PriorityQueue;

public int nthSuperUglyNumber(int n, int[] primes) {
    PriorityQueue<Long> pq = new PriorityQueue<>();
    pq.add(1L);
    for (int i = 1; i < n; i++) {
        long temp = pq.poll();
        for (int prime : primes) {
            pq.add(temp * prime);
        }
        while (!pq.isEmpty() && pq.peek() == temp) {
            pq.poll();
        }
    }
    return pq.poll().intValue();
}
