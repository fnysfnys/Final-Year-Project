import java.util.PriorityQueue;

public int nthUglyNumber(int n) {
    if (n == 1) return 1;

    PriorityQueue<Long> minHeap = new PriorityQueue<>();
    minHeap.offer(1L);
    long ugly = 1;

    for (int i = 1; i < n; i++) {
        ugly = minHeap.poll();
        while (!minHeap.isEmpty() && minHeap.peek() == ugly) {
            minHeap.poll(); // Remove duplicates
        }
        minHeap.offer(ugly * 2);
        minHeap.offer(ugly * 3);
        minHeap.offer(ugly * 5);
    }

    return (int) ugly;
}
