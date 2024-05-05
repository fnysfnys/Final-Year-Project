class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
       int[][] left = new int[intervals.length / 2][];
       int[][] right = new int[intervals.length / 2][];
       for (int i = 0; i < intervals.length; i++) {
           if (i < intervals.length / 2) {
               left[i] = intervals[i];
           } else {
               right[i - intervals.length / 2] = intervals[i];
           }
       }
       int count = 0;
       for (int i = 0; i < intervals.length; i++) {
           if (left[i][0] <= right[i][0] && left[i][1] >= right[i][1]) {
               count++;
           }
       }
       return count;
    }
    
}
