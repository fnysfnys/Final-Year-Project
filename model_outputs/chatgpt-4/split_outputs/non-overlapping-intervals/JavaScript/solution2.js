function eraseOverlapIntervals(intervals) {
    intervals.sort((a, b) => a[0] - b[0]);
    let end = intervals[0][1];
    let count = 0;
    for (let i = 1; i < intervals.length; i++) {
        if (intervals[i][0] < end) {
            count++;
            end = Math.min(end, intervals[i][1]); // Keep the interval with the smaller end
        } else {
            end = intervals[i][1];
        }
    }
    return count;
}
