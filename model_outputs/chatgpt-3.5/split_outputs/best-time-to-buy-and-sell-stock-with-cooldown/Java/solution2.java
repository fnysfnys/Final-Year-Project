public int maxProfit(int[] prices) {
    int n = prices.length;
    if (n <= 1) return 0;
    
    int prev2 = 0, prev1 = Math.max(0, prices[1] - prices[0]);
    
    for (int i = 2; i < n; i++) {
        int current = Math.max(prev1, prev2 - prices[i - 1] + prices[i]);
        prev2 = prev1;
        prev1 = current;
    }
    
    return prev1;
}
