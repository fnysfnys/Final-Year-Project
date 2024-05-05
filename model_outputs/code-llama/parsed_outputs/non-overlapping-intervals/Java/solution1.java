class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
       Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
       int count = 0;
       for (int i = 0; i < intervals.length; i++) {
           if (intervals[i][1] <= intervals[i + 1][0]) {
               count++;
           }
       }
       return count;
    }
    
}
