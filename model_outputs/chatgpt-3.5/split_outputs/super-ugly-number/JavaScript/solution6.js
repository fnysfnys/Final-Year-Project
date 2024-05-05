var nthSuperUglyNumber = function(n, primes) {
    const minHeap = new PriorityQueue({ comparator: (a, b) => a - b });
    minHeap.enqueue(1);

    while (n > 1) {
        const current = minHeap.dequeue();
        for (let prime of primes) {
            minHeap.enqueue(current * prime);
        }
        n--;
    }

    return minHeap.dequeue();
};
