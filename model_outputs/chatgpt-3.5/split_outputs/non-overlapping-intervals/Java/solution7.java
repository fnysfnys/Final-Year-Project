public int eraseOverlapIntervals(int[][] intervals) {
    Arrays.sort(intervals, (a, b) -> {
        if (a[1] != b[1]) return a[1] - b[1];
        return a[0] - b[0];
    });
    
    int count = 1, end = intervals[0][1];
    
    for (int i = 1; i < intervals.length; i++) {
        if (intervals[i][0] >= end) {
            count++;
            end = intervals[i][1];
        }
    }
    
    return intervals.length - count;
}
