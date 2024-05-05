function eraseOverlapIntervals(intervals) {
    intervals.sort((a, b)

 => {
        if (a[1] !== b[1]) return a[1] - b[1];
        return a[0] - b[0];
    });
    let count = 0;
    let end = intervals[0][1];
    for (let i = 1; i < intervals.length; i++) {
        if (intervals[i][0] < end) {
            count++;
        } else {
            end = intervals[i][1];
        }
    }
    return count;
}
