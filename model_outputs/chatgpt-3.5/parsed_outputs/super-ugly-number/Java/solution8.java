import java.util.PriorityQueue;

class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] uglyNumbers = new int[n];
        uglyNumbers[0] = 1;
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
    
        for (int prime : primes) {
            minHeap.offer(new int[]{prime, prime, 0});
        }
    
        for (int i = 1; i < n; i++) {
            uglyNumbers[i] = minHeap.peek()[0];
    
            while (minHeap.peek()[0] == uglyNumbers[i]) {
                int[] current = minHeap.poll();
                int prime = current[0];
                int nextUgly = current[1] * uglyNumbers[current[2]];
                int index = current[2] + 1;
                minHeap.offer(new int[]{prime, nextUgly, index});
            }
        }
    
        return uglyNumbers[n - 1];
    }
}
