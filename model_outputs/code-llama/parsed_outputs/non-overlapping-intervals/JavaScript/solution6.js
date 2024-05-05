function eraseOverlapIntervals(intervals) {
   intervals.sort((a, b) => a[0] - b[0]);
   let removed = 0;
   for (let i = 0; i < intervals.length; i++) {
       let left = intervals[i][0];
       let right = intervals[i][1];
       let mid = Math.floor((left + right) / 2);
       let count = 0;
       for (let j = 0; j < intervals.length; j++) {
           if (intervals[j][0] <= mid && intervals[j][1] > mid) {
               count++;
           }
       }
       if (count > 1) {
           removed++;
       }
   }
   return removed;
}
