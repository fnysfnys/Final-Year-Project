import java.util.PriorityQueue;

class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        PriorityQueue<Long> minHeap = new PriorityQueue<>();
        minHeap.offer(1L);
    
        for (int i = 1; i < n; i++) {
            long current = minHeap.poll();
            while (!minHeap.isEmpty() && minHeap.peek() == current) {
                minHeap.poll(); // Remove duplicates
            }
            for (int prime : primes) {
                minHeap.offer(current * prime);
            }
        }
    
        return minHeap.poll().intValue();
    }
}
