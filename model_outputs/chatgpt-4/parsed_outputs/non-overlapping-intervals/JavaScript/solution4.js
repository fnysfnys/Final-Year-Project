function eraseOverlapIntervals(intervals) {
    intervals.sort((a, b) => a[1] - b[1]);
    let count = 0, i = 1, prevEnd = intervals[0][1];
    while (i < intervals.length) {
        if (intervals[i][0] < prevEnd) {
            count++;
        } else {
            prevEnd = intervals[i][1];
        }
        i++;
    }
    return count;
}