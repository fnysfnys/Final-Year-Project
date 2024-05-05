import java.util.*;

class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        pq.offer(1L);

        for (int i = 1; i < n; i++) {
            long curr = pq.poll();
            for (int prime : primes) {
                pq.offer(curr * prime);
            }
            // Remove duplicates
            while (!pq.isEmpty() && pq.peek() == curr) {
                pq.poll();
            }
        }

        return pq.poll().intValue();
    }
}
