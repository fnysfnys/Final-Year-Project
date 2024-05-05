/**
 * An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
 * Given an integer n, return the nth ugly number.
 */
class MinHeap {
    constructor() {
        this.heap = [];
    }

    insert(num) {
        this.heap.push(num);
        this.heap.sort((a, b) => a - b);
    }

    remove() {
        return this.heap.shift();
    }

    get size() {
        return this.heap.length;
    }
}

var nthUglyNumber = function(n) {
    let minHeap = new MinHeap();
    minHeap.insert(1);
    let value = 0;

    for (let i = 0; i < n; i++) {
        value = minHeap.remove();
        [2, 3, 5].forEach(factor => {
            if (!minHeap.heap.includes(value * factor)) {
                minHeap.insert(value * factor);
            }
        });
    }

    return value;
};
