class MinHeap {
    constructor() {
        this.heap = [1];
    }

    insert(val) {
        this.heap.push(val);
        this.heapifyUp();
    }

    extractMin() {
        const min = this.heap[1];
        const last = this.heap.pop();

        if (this.heap.length > 1) {
            this.heap[1] = last;
            this.heapifyDown();
        }

        return min;
    }

    heapifyUp() {
        let index = this.heap.length - 1;

        while (index > 1) {
            const parentIndex = Math.floor(index / 2);

            if (this.heap[index] < this.heap[parentIndex]) {
                [this.heap[index], this.heap[parentIndex]] = [this.heap[parentIndex], this.heap[index]];
                index = parentIndex;
            } else {
                break;
            }
        }
    }

    heapifyDown() {
        let index = 1;

        while (index * 2 < this.heap.length) {
            let leftChildIndex = index * 2;
            let rightChildIndex = index * 2 + 1;
            let smallerChildIndex = leftChildIndex;

            if (rightChildIndex < this.heap.length && this.heap[rightChildIndex] < this.heap[leftChildIndex]) {
                smallerChildIndex = rightChildIndex;
            }

            if (this.heap[index] > this.heap[smallerChildIndex]) {
                [this.heap[index], this.heap[smallerChildIndex]] = [this.heap[smallerChildIndex], this.heap[index]];
                index = smallerChildIndex;
            } else {
                break;
            }
        }
    }
}

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
