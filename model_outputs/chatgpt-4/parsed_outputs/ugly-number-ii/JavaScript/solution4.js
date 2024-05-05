/**
 * An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
 * Given an integer n, return the nth ugly number.
 */
class PriorityQueue {
    constructor(comparator = (a, b) => a - b) {
        this._heap = [];
        this._comparator = comparator;
    }

    push(value) {
        this._heap.push(value);
        this._heap.sort(this._comparator);
    }

    pop() {
        return this._heap.shift();
    }

    size() {
        return this._heap.length;
    }
}

var nthUglyNumber = function(n) {
    let pq = new PriorityQueue();
    let seen = new Set([1]);
    pq.push(1);

    while (seen.size < n) {
        let current = pq.pop();
        for (let factor of [

2, 3, 5]) {
            let next = current * factor;
            if (!seen.has(next)) {
                seen.add(next);
                pq.push(next);
            }
        }
    }

    return Array.from(seen).sort((a, b) => a - b)[n - 1];
};