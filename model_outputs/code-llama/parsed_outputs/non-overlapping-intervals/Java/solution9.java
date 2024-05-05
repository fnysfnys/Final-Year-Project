class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
       int count = 0;
       for (int i = 0; i < intervals.length; i++) {
           if (intervals[i][0] <= intervals[i + 1][0] && intervals[i][1] >= intervals[i + 1][1]) {
               count++;
           }
       }
       return count;
    }
    
}
