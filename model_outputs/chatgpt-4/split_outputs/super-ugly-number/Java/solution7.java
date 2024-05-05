import org.jgrapht.util.FibonacciHeap;

public int nthSuperUglyNumber(int n, int[] primes) {
    FibonacciHeap<Long> heap = new FibonacciHeap<>();
    heap.insert(1L, 1);
    long ugly = 1;
    for (int i = 0; i < n; i++) {
        ugly = heap.min().getKey();
        heap.removeMin();
        for (int prime : primes) {
            heap.insert(ugly * prime, (int) (ugly * prime));
        }
    }
    return (int) ugly;
}
