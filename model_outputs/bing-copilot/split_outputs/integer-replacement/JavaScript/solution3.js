var integerReplacement = function(n) {
    const dp = new Array(n + 1).fill(0);
    for (let i = 2; i <= n; i++) {
        dp[i] = 1 + (i % 2 === 0 ? dp[i / 2] : Math.min(dp[i + 1], dp[i - 1]));
    }
    return dp[n];
};
