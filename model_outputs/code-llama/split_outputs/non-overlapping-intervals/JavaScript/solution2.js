function eraseOverlapIntervals(intervals) {
   intervals.sort((a, b) => a[0] - b[0]);
   let removed = 0;
   for (let i = 1; i < intervals.length; i++) {
       if (intervals[i][0] <= intervals[i - 1][1]) {
           removed++;
       }
   }
   return removed;
}
