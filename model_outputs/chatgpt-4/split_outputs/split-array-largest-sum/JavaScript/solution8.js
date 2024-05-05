var splitArray = function(nums, k) {
    const n = nums.length;
    const dp = new Array(k + 1).fill(0).map(() => new Array(n + 1).fill(Infinity));
    const prefixSum = nums.reduce((acc, val, i) => {
        acc[i + 1] = acc[i] + val;
        return acc;
    }, [0]);

    dp[0][0] = 0;
    for (let i = 1; i <= k; i++) {
        for (let j = 1; j <= n; j++) {
            for (let m = 0; m < j; m++) {
                dp[i][j] = Math.min(dp[i][j], Math.max(dp[i - 1][m], prefixSum[j] - prefixSum[m]));
            }
        }
    }
    return dp[k][n];
};
