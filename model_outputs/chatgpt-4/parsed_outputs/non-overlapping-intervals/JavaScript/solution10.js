var eraseOverlapIntervals = function(intervals) {
    intervals.sort((a, b) => a[1] - b[1]);
    let removalCount = 0, lastNonOverlappingEnd = intervals[0][1];
    for (let i = 1; i < intervals.length; i++) {
        if (intervals[i][0] < lastNonOverlappingEnd) {
            removalCount++;
        } else {
            lastNonOverlappingEnd = intervals[i][1];
        }
    }
    return removalCount;
};