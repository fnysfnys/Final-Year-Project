var maxProfit = function(prices) {
    let minPrice = prices[0];
    let maxProfit = 0;
    
    for (let i = 1; i < prices.length; i++) {
        if (prices[i] > minPrice) {
            maxProfit += prices[i] - minPrice;
            minPrice = prices[i];
        } else {
            minPrice = Math.min(minPrice, prices[i]);
        }
    }
    
    return maxProfit;
};