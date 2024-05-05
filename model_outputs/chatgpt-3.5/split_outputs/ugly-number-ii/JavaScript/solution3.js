/**
 * @param {number} n
 * @return {number}
 */
var nthUglyNumber = function(n) {
    const heap = [1];
    const factors = [2, 3, 5];

    while (n > 1) {
        const curr = heap.shift();
        for (const factor of factors) {
            const next = curr * factor;
            if (!heap.includes(next)) {
                heap.push(next);
            }
        }
        heap.sort((a, b) => a - b);
        n--;
    }

    return heap[0];
};
