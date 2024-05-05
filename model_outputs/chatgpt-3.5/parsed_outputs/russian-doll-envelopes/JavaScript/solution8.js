/**
 * Using a Priority Queue (Heap)
 * @param {number[][]} envelopes
 * @return {number}
 */
var maxEnvelopes = function(envelopes) {
    envelopes.sort((a, b) => a[0] - b[0] || b[1] - a[1]);
    const heap = new MinHeap();

    for (const [w, h] of envelopes) {
        heap.insert(h);
    }

    let maxCount = 0;
    for (const [w, h] of envelopes) {
        if (heap.peek() >= h) {
            heap.extractMin();
        } else {
            maxCount++;
        }
    }

    return maxCount;
};

class MinHeap {
    constructor() {
        this.heap = [];
    }

    insert(val) {
        this.heap.push(val);
        this.bubbleUp();
    }

    extractMin() {
        const min = this.heap[0];
        const end = this.heap.pop();
        if (this.heap.length > 0) {
            this.heap[0] = end;
            this.sinkDown();
        }
        return min;
    }

    peek() {
        return this.heap[0];
    }

    bubbleUp() {
        let index = this.heap.length - 1;
        while (index > 0) {
            const parentIndex = Math.floor((index - 1) / 2);
            if (this.heap[index] >= this.heap[parentIndex]) break;
            [this.heap[index], this.heap[parentIndex]] = [this.heap[parentIndex], this.heap[index]];
            index = parentIndex;
        }
    }

    sinkDown() {
        let index = 0;
        const length = this.heap.length;
        while (true) {
            const leftChildIndex = 2 * index + 1;
            const rightChildIndex = 2 * index + 2;
            let swap = null;
            if (leftChildIndex < length) {
                if (this.heap[leftChildIndex] < this.heap[index]) {
                    swap = leftChildIndex;
                }
            }
            if (rightChildIndex < length) {
                if (
                    (swap === null && this.heap[rightChildIndex] < this.heap[index]) ||
                    (swap !== null && this.heap[rightChildIndex] < this.heap[leftChildIndex])
                ) {
                    swap = rightChildIndex;
                }
            }
            if (swap === null) break;
            [this.heap[index], this.heap[swap]] = [this.heap[swap], this.heap[index]];
            index = swap;
        }
    }
}