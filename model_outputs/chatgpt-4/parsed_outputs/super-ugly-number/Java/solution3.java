import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        Set<Long> seen = new HashSet<>();
        PriorityQueue<Long> pq = new PriorityQueue<>();
        pq.add(1L);
        seen.add(1L);
        long number = 1;
        for (int i = 0; i < n; i++) {
            number = pq.poll();
            for (int prime : primes) {
                long nextUgly = number * prime;
                if (seen.add(nextUgly)) {
                    pq.add(nextUgly);
                }
            }
        }
        return (int) number;
    }
}
