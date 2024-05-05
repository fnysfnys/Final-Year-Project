public int maxProfit(int[] prices) {
    int n = prices.length;
    if (n <= 1) return 0;
    
    int buy = -prices[0];
    int sell = 0;
    int cooldown = 0;
    
    for (int i = 1; i < n; i++) {
        int prevBuy = buy;
        int prevSell = sell;
        
        buy = Math.max(buy, cooldown - prices[i]);
        sell = Math.max(sell, prevBuy + prices[i]);
        cooldown = Math.max(cooldown, prevSell);
    }
    
    return Math.max(sell, cooldown);
}
