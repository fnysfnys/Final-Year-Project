class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return 0;
        }
        
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        
        int count = 0;
        int prevEnd = Integer.MIN_VALUE;
        
        for (int[] interval : intervals) {
            if (interval[0] < prevEnd) {
                count++;
                prevEnd = Math.min(prevEnd, interval[1]);
            } else {
                prevEnd = interval[1];
            }
        }
        
        return count;
    }
    
}
