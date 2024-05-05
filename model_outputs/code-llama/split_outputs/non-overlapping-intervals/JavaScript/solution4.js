function eraseOverlapIntervals(intervals) {
   if (intervals.length <= 1) {
       return 0;
   }
   let mid = Math.floor(intervals.length / 2);
   let left = intervals.slice(0, mid);
   let right = intervals.slice(mid);
   let leftRemoved = eraseOverlapIntervals(left);
   let rightRemoved = eraseOverlapIntervals(right);
   let removed = leftRemoved + rightRemoved;
   for (let i = 0; i < mid; i++) {
       if (left[i][1] > right[i][0]) {
           removed++;
       }
   }
   return removed;
}
