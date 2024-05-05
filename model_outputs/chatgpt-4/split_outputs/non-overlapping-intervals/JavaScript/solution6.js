var eraseOverlapIntervals = intervals => {
    intervals.sort((a, b) => a[1] - b[1]);
    let count = 0, lastIncluded = 0;
    for (let i = 1; i < intervals.length; i++) {
        if (intervals[i][0] < intervals[lastIncluded][1]) {
            count++;
        } else {
            lastIncluded = i;
        }
    }
    return count;
};
