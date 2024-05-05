var countDigitOne = function(n) {
    const dp = new Array(n + 1).fill(0);
    for (let i = 1; i <= n; i++) {
        dp[i] = dp[i - 1] + String(i).split('1').length - 1;
    }
    return dp[n];
};
