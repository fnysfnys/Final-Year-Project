function eraseOverlapIntervals(intervals) {
    intervals.sort((a, b) => a[0] - b[0]);
    let merged = [];
    for (let interval of intervals) {
        if (!merged.length || merged[merged.length - 1][1] <= interval[0]) {
            merged.push(interval);
        } else {
            merged[merged.length - 1][1] = Math.min(merged[merged.length - 1][1], interval[1]);
        }
    }
    return intervals.length - merged.length;
}
