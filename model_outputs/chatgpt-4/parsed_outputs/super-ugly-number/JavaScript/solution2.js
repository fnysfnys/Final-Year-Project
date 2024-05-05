var nthSuperUglyNumber = function(n, primes) {
    let heap = new MinHeap();
    heap.push(1);
    let number, prev;

    for (let i = 0; i < n; i++) {
        number = heap.pop();

        if (number !== prev) {
            primes.forEach(prime => {
                heap.push(number * prime);
            });
        }

        prev = number;
    }

    return number;
};

class MinHeap {
    // Implementation of a basic MinHeap
}