const IntervalTree = require('interval-tree');

function eraseOverlapIntervals(intervals) {
  const tree = new IntervalTree();
  intervals.forEach(([start, end]) => tree.insert([start, end]));
  let count = 0;
  let prevEnd = 0;
  for (const [_, [start, end]] of tree.searchInterval([prevEnd, Infinity])) {
    if (start < end) {
      count++;
      prevEnd = end;
    }
  }
  return count;
}
