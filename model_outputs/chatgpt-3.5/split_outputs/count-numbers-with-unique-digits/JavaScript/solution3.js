var countNumbersWithUniqueDigits = function(n) {
    if (n === 0) return 1;
    if (n === 1) return 10;
    
    const dp = new Array(n + 1).fill(0);
    dp[0] = 1;
    dp[1] = 10;
    
    for (let i = 2; i <= n; i++) {
        dp[i] = dp[i - 1] + (dp[i - 1] - dp[i - 2]) * (11 - i);
    }
    
    return dp[n];
};
