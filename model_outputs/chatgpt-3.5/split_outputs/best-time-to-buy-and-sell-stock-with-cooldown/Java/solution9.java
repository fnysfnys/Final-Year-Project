public int maxProfit(int[] prices) {
    int n = prices.length;
    if (n <= 1) return 0;
    
    int[] buy = new int[n];
    int[] sell = new int[n];
    buy[0] = -prices[0];
    
    for (int i = 1; i < n; i++) {
        buy[i] = Math.max(buy[i - 1], sell[i - 2] - prices[i]);
        sell[i] = Math.max(sell[i - 1], buy[i - 1] + prices[i]);
    }
    
    return sell[n - 1];
}
