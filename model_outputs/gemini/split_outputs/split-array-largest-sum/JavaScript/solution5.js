function splitArray(nums, k) {
  const minHeap = new MinPriorityQueue({ priority: (e) => e[1] });
  const sorted = nums.sort((a, b) => b - a);

  minHeap.enqueue([0, 0]); // Initial subarray

  while (minHeap.size() < k) {
    const [i, curSum] = minHeap.dequeue();
    minHeap.enqueue([i + 1, curSum]);
    minHeap.enqueue([i + 1, curSum + sorted[i]]);
  }

  return minHeap.peek()[1];
}
