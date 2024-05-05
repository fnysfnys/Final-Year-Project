function eraseOverlapIntervals(intervals) {
    if (intervals.length === 0) return 0;
    intervals.sort((a, b) => a[0] - b[0]);
    let prevEnd = intervals[0][1];
    let removals = 0;
    for (let i = 1; i < intervals.length; i++) {
        if (intervals[i][0] < prevEnd) {
            removals++;
            prevEnd = Math.min(prevEnd, intervals[i][1]);
        } else {
            prevEnd = intervals[i][1];
        }
    }
    return removals;
}
