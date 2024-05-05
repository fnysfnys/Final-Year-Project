const eraseOverlapIntervals = intervals => {
    intervals.sort((a, b) => a[1] - b[1]);
    let count = 0, prevEnd = intervals[0][1];
    intervals.forEach(([start, end]) => {
        if (start < prevEnd) {
            count++;
        } else {
            prevEnd = end;
        }
    });
    return count;
};