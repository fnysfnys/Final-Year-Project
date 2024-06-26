var maxProfit = function(prices) {
    const n = prices.length;
    const dp = Array.from({ length: n }, () => [0, 0, 0]); // [buy, sell, cooldown]
    dp[0][0] = -prices[0];
    
    for (let i = 1; i < n; i++) {
        dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][2] - prices[i]);
        dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] + prices[i]);
        dp[i][2] = Math.max(dp[i - 1][2], dp[i - 1][1]);
    }
    
    return Math.max(dp[n - 1][1], dp[n - 1][2]);
};
