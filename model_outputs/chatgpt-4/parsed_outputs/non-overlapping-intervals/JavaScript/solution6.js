var eraseOverlapIntervals = function(intervals) {
    // Sort intervals based on end times
    intervals.sort((a, b) => a[1] - b[1]);
    
    let count = 0; // Initialize count of intervals to remove
    let prevEnd = intervals[0][1]; // Track end of last non-overlapping interval

    // Iterate over intervals starting from the second one
    for (let i = 1; i < intervals.length; i++) {
        if (intervals[i][0] < prevEnd) {
            // If current interval overlaps with previous, increment count
            count++;
        } else {
            // Update prevEnd to current interval's end if no overlap
            prevEnd = intervals[i][1];
        }
    }
    return count;
};