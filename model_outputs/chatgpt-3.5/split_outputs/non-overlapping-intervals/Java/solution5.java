public int eraseOverlapIntervals(int[][] intervals) {
    Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
    int count = 1, end = intervals[0][1];
    
    count += Arrays.stream(intervals)
            .skip(1)
            .filter(interval -> interval[0] >= end)
            .peek(interval -> end = interval[1])
            .count();
    
    return intervals.length - count;
}
