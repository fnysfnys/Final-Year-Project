function eraseOverlapIntervals(intervals) {
  intervals.sort((a, b) => a[0] - b[0]); // Sort by start time
  const stack = [];
  let count = 0;
  for (const [start, end] of intervals) {
    while (stack.length && stack[stack.length - 1][1] > start) {
      count++; // Overlap occurs, remove top
      stack.pop();
    }
    stack.push([start, end]);
  }
  return count;
}
