var maxProfit = function(prices) {
    let profit = 0;
    let i = 0;
    
    while (i < prices.length) {
        while (i < prices.length - 1 && prices[i] >= prices[i + 1]) {
            i++;
        }
        const buy = prices[i];
        while (i < prices.length - 1 && prices[i] <= prices[i + 1]) {
            i++;
        }
        const sell = prices[i];
        profit += Math.max(0, sell - buy);
    }
    
    return profit;
};
