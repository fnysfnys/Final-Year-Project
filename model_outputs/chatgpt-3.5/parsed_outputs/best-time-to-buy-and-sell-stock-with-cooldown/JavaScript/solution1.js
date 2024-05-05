var maxProfit = function(prices) {
    const n = prices.length;
    if (n <= 1) return 0;
    
    const buy = new Array(n);
    const sell = new Array(n);
    
    buy[0] = -prices[0];
    sell[0] = 0;
    
    for (let i = 1; i < n; i++) {
        buy[i] = Math.max(buy[i - 1], (i >= 2 ? sell[i - 2] : 0) - prices[i]);
        sell[i] = Math.max(sell[i - 1], buy[i - 1] + prices[i]);
    }
    
    return sell[n - 1];
};