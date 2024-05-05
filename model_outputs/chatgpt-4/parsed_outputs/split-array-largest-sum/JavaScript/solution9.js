var splitArray = function(nums, k) {
    const n = nums.length;
    const dp = new Array(k + 1).fill(0).map(() => new Array(n + 1).fill(Infinity));

    for (let i = 0; i <= n; i++) {
        dp[1][i] = nums.slice(0, i).reduce((a, b) => a + b, 0);
    }

    for (let i = 2; i <= k; i++) {
        for (let j = 0; j <= n; j++) {
            for (let m = 0; m < j; m++) {
                dp[i][j] = Math.min(dp[i][j], Math.max(dp[i - 1][m], nums.slice(m, j).reduce((a, b) => a + b, 0)));
            }
        }
    }
    return dp[k][n];
};