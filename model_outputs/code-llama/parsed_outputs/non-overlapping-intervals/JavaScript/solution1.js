function eraseOverlapIntervals(intervals) {
   let removed = 0;
   for (let i = 0; i < intervals.length; i++) {
       for (let j = i + 1; j < intervals.length; j++) {
           if (intervals[i][1] > intervals[j][0]) {
               removed++;
           }
       }
   }
   return removed;
}
