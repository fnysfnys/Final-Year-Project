function eraseOverlapIntervals(intervals) {
   let graph = new Graph();
   for (let i = 0; i < intervals.length; i++) {
       graph.addVertex(intervals[i][0]);
       graph.addVertex(intervals[i][1]);
       graph.addEdge(intervals[i][0], intervals[i][1]);
   }
   let removed = 0;
   for (let i = 0; i < intervals.length; i++) {
       if (graph.find(intervals[i][0]) > intervals[i][1]) {
           removed++;
       }
   }
   return removed;
}
