import java.util.Arrays;

class Solution {
    
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) return 0;
        
        // Sort the intervals by their end times
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        
        int count = 0; // Count of intervals to remove
        int end = intervals[0][1]; // End of the first interval
        
        // Iterate through the intervals starting from the second
        for (int i = 1; i < intervals.length; i++) {
            // If the current interval starts before the end of the previous interval, it overlaps
            if (intervals[i][0] < end) {
                count++; // Need to remove an interval
            } else {
                // No overlap, update the end to be the end of the current interval
                end = intervals[i][1];
            }
        }
        
        return count;
    }
}