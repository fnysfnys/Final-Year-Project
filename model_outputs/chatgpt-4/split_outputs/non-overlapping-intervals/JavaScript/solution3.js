function eraseOverlapIntervals(intervals) {
    intervals.sort((a, b) => a[0] - b[0]);
    const dp = new Array(intervals.length).fill(1);
    let max = 1;
    for (let i = 1; i < intervals.length; i++) {
        for (let j = 0; j < i; j++) {
            if (intervals[i][0] >= intervals[j][1]) {
                dp[i] = Math.max(dp[i], dp[j] + 1);
            }
        }
        max = Math.max(max, dp[i]);
    }
    return intervals.length - max;
}
