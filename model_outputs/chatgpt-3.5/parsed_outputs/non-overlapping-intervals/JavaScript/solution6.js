/**
 * @param {number[][]} intervals
 * @return {number}
 */
var eraseOverlapIntervals = function(intervals) {
    if (intervals.length === 0) return 0;
    
    intervals.sort((a, b) => a[1] - b[1]);
    
    function eraseOverlapHelper(index, prevEnd) {
        if (index === intervals.length) return 0;
        
        let chooseCurrent = 0;
        if (intervals[index][0] >= prevEnd) {
            chooseCurrent = 1 + eraseOverlapHelper(index + 1, intervals[index][1]);
        }
        
        const skipCurrent = eraseOverlapHelper(index + 1, prevEnd);
        
        return Math.max(chooseCurrent, skipCurrent);
    }
    
    return intervals.length - eraseOverlapHelper(0, -Infinity);
};
