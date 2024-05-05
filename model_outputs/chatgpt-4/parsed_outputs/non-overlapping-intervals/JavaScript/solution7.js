var eraseOverlapIntervals = function(intervals) {
    intervals.sort((a, b) => a[1] - b[1]);
    let count = 0

, prevEnd = intervals[0][1];
    for (let index = 1; index < intervals.length; index++) {
        if (intervals[index][0] < prevEnd) {
            count++;
        } else {
            prevEnd = intervals[index][1];
        }
    }
    return count;
};