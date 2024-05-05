/**
 * An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
 * Given an integer n, return the nth ugly number.
 */
var nthUglyNumber = function(n) {
    let seen = new Set([1]);
    let heap = [1];

    while (seen.size < n) {
        let current = heap.shift();
        for (let factor of [2, 3, 5]) {
            let next = current * factor;
            if (!seen.has(next)) {
                seen.add(next);
                heap.push(next);
                heap.sort((a, b) => a - b);
            }
        }
    }

    return heap[0];
};