import java.util.HashSet;
import java.util.PriorityQueue;

class Solution {
    public int nthUglyNumber(int n) {
        HashSet<Long> seen = new HashSet<>();
        PriorityQueue<Long> pq = new PriorityQueue<>();
        pq.offer(1L);
        seen.add(1L);
    
        int[] primes = {2, 3, 5};
        long ugly = 1;
    
        for (int i = 0; i < n; i++) {
            ugly = pq
    
    .poll();
            for (int prime : primes) {
                long nextUgly = ugly * prime;
                if (!seen.contains(nextUgly)) {
                    seen.add(nextUgly);
                    pq.offer(nextUgly);
                }
            }
        }
    
        return (int) ugly;
    }
}
