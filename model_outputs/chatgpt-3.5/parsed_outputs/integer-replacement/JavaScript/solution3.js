var integerReplacement = function(n) {
    const dp = new Array(n + 1).fill(0);
    for (let i = 2; i <= n; i++) {
        if (i % 2 === 0) dp[i] = 1 + dp[i / 2];
        else dp[i] = 1 + Math.min(dp[i + 1] || Infinity, dp[i - 1] || Infinity);
    }
    return dp[n];
};