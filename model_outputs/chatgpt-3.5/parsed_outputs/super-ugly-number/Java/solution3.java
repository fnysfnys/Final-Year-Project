import java.util.HashSet;
import java.util.PriorityQueue;

class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        HashSet<Integer> seen = new HashSet<>();
        minHeap.offer(1);
        seen.add(1);
    
        for (int i = 1; i < n; i++) {
            int current = minHeap.poll();
            for (int prime : primes) {
                long next = (long) current * prime;
                if (!seen.contains(next)) {
                    minHeap.offer((int) next);
                    seen.add((int) next);
                }
            }
        }
    
        return minHeap.poll();
    }
}
