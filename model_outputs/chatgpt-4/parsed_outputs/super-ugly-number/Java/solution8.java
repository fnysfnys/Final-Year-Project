import java.util.PriorityQueue;

class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        PriorityQueue<Long> heap = new PriorityQueue<>();
        heap.add(1L);
        long number = 1;
        for (int i = 1; i < n; i++) {
            number = heap.poll();
            for (int prime : primes) {
                long nextUgly = number * prime;
                if (!heap.contains(nextUgly)) {
                    heap.add(nextUgly);
                }
            }
        }
        return (int) number;
    }
}
