/**
 * @param {number[][]} intervals
 * @return {number}
 */
var eraseOverlapIntervals = function(intervals) {
    if (intervals.length === 0) return 0;
    
    intervals.sort((a, b) => a[1] - b[1]);
    let count = 0;
    let endMap = new Map();
    
    for (let i = 0; i < intervals.length; i++) {
        if (intervals[i][0] < endMap.get(endMap.size - 1) || i === 0) {
            count++;
        } else {
            endMap.set(i, intervals[i][1]);
        }
    }
    
    return count;
};
