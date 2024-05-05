var nthSuperUglyNumber = function(n, primes) {
    let minHeap = new MinHeap();
    minHeap.insert(1);

    while (n > 1) {
        let current = minHeap.extractMin();
        for (let prime of primes) {
            minHeap.insert(current * prime);
        }
        n--;
    }

    return minHeap.extractMin();
};