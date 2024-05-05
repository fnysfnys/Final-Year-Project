var nthSuperUglyNumber = function(n, primes) {
    const heap = [1];
    const seen = new Set([1]);

    while (heap.length > 0) {
        const curr = heap.shift();
        if (seen.size === n) {
            return curr;
        }
        for (const prime of primes) {
            const next = curr * prime;
            if (!seen.has(next)) {
                seen.add(next);
                heap.push(next);
            }
        }
        heap.sort((a, b) => a - b);
    }
};
