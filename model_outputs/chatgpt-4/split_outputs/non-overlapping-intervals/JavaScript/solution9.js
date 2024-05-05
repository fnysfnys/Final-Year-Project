function eraseOverlapIntervals(intervals) {
    intervals.sort((a, b) => b[0] - a[0]);
    let end = intervals[0][1];
    let count = 0;
    for (let i = 1; i < intervals.length; i++) {
        if (intervals[i][1] > end) {
            count++;
            end = intervals[i][0];
        }
    }
    return count;
}
