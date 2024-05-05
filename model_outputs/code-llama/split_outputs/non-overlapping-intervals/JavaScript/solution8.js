function eraseOverlapIntervals(intervals) {
   let tree = new Tree();
   for (let i = 0; i < intervals.length; i++) {
       tree.insert(intervals[i][0], intervals[i][1]);
   }
   let removed = 0;
   for (let i = 0; i < intervals.length; i++) {
       if (tree.find(intervals[i][0]) > intervals[i][1]) {
           removed++;
       }
   }
   return removed;
}
