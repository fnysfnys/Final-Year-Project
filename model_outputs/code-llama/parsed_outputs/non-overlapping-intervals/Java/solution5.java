class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
       DisjointSet<Integer> intervalSet = new DisjointSet<>();
       for (int[] interval : intervals) {
           intervalSet.add(interval[0], interval[1]);
       }
       int count = 0;
       for (int i = 0; i < intervals.length; i++) {
           if (intervalSet.find(intervals[i][0]) != intervalSet.find(intervals[i][1])) {
               count++;
           }
       }
       return count;
    }
    
}
