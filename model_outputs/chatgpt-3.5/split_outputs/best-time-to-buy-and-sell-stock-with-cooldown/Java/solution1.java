public int maxProfit(int[] prices) {
    int n = prices.length;
    if (n <= 1) return 0;
    
    int[] dp = new int[n];
    dp[0] = 0;
    dp[1] = Math.max(0, prices[1] - prices[0]);
    
    for (int i = 2; i < n; i++) {
        dp[i] = Math.max(dp[i - 1], dp[i - 2] - prices[i - 1] + prices[i]);
    }
    
    return dp[n - 1];
}
