var nthUglyNumber = function(n) {
  const queue = new MinPriorityQueue();
  queue.enqueue(1);
  const seen = new Set();
  for (let i = 1; i < n; i++) {
    const num = queue.dequeue();
    if (!seen.has(num * 2)) {
      queue.enqueue(num * 2);
      seen.add(num * 2);
    }
    if (!seen.has(num * 3)) {
      queue.enqueue(num * 3);
      seen.add(num * 3);
    }
    if (!seen.has(num * 5)) {
      queue.enqueue(num * 5);
      seen.add(num * 5);
    }
  }
  return queue.dequeue();
};
