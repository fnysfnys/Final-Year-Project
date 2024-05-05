function eraseOverlapIntervals(intervals) {
   let hash = {};
   for (let i = 0; i < intervals.length; i++) {
       hash[intervals[i][0]] = intervals[i][1];
   }
   let removed = 0;
   for (let i = 0; i < intervals.length; i++) {
       if (hash[intervals[i][0]] > intervals[i][1]) {
           removed++;
       }
   }
   return removed;
}
