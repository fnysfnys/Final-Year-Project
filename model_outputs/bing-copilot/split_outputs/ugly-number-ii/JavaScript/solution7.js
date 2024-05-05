var nthUglyNumber = function(n) {
    const pq = new MinHeap();
    pq.insert(1);
    let count = 0;
    while (count < n) {
        const cur = pq.extractMin();
        if (cur !== pq.peek()) {
            pq.insert(cur * 2);
            pq.insert(cur * 3);
            pq.insert(cur * 5);
            count++;
        }
    }
    return pq.peek();
};
