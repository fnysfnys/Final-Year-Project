var eraseOverlapIntervals = function(intervals) {
    intervals.sort((a, b) => a[0] - b[0]);
    const n = intervals.length;
    const dp = new Array(n).fill(1);
    for (let i = 1; i < n; i++) {
        for (let j = 0; j < i; j++) {
            if (intervals[i][0] >= intervals[j][1]) {
                dp[i] = Math.max(dp[i], dp[j] + 1);
            }
        }
    }
    return n - Math.max(...dp);
};
