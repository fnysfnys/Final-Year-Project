function eraseOverlapIntervals(intervals) {
   intervals.sort((a, b) => a[1] - b[1]);
   let removed = 0;
   for (let i = 0; i < intervals.length; i++) {
       if (intervals[i][1] > intervals[i - 1][1]) {
           removed++;
       }
   }
   return removed;
}
