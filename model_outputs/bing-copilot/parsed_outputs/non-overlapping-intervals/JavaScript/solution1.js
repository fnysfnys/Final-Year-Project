var eraseOverlapIntervals = function(intervals) {
    intervals.sort((a, b) => a[0] - b[0]);
    let count = 0;
    for (let i = 0; i < intervals.length; i++) {
        for (let j = i + 1; j < intervals.length; j++) {
            if (intervals[j][0] < intervals[i][1]) {
                count++;
                intervals.splice(j, 1);
                j--;
            }
        }
    }
    return count;
};
