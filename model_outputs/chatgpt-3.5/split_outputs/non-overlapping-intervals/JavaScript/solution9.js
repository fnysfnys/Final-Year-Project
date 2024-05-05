/**
 * @param {number[][]} intervals
 * @return {number}
 */
var eraseOverlapIntervals = function(intervals) {
    if (intervals.length === 0) return 0;
    
    intervals.sort((a, b) => a[0] - b[0]);
    let count = 0;
    let nonOverlappingSet = new Set();
    
    for (let i = 0; i < intervals.length; i++) {
        if (nonOverlappingSet.size === 0) {
            nonOverlappingSet.add(i);
        } else {
            let lastNonOverlap = nonOverlappingSet.values().next().value;
            if (intervals[i][0] >= intervals[lastNonOverlap][1]) {
                nonOverlappingSet.add(i);
            } else if (intervals[i][1] < intervals[lastNonOverlap][1]) {
                nonOverlappingSet.delete(lastNonOverlap);
                nonOverlappingSet.add(i);
            }
        }
    }
    
    return intervals.length - nonOverlappingSet.size;
};

