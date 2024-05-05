/**
 * @param {number[][]} intervals
 * @return {number}
 */
var eraseOverlapIntervals = function(intervals) {
    if (intervals.length === 0) return 0;
    
    intervals.sort((a, b) => a[0] - b[0]);
    let count = 0;
    let left = 0;
    let right = 1;
    
    while (right < intervals.length) {
        if (intervals[right][0] < intervals[left][1]) {
            count++;
            if (intervals[right][1] < intervals[left][1]) {
                left = right;
            }
        } else {
            left = right;
        }
        right++;
    }
    
    return count;
};
