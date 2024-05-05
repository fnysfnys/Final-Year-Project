var nthSuperUglyNumber = function(n, primes) {
    let uglyNumbers = new Set([1]);
    let heap = new MinHeap();
    heap.push(1);

    while (uglyNumbers.size < n) {
        let current = heap.pop();
        primes.forEach(prime => uglyNumbers.add(current * prime));
        uglyNumbers.forEach(num => heap.push(num));
    }

    return [...uglyNumbers][n - 1];
};
