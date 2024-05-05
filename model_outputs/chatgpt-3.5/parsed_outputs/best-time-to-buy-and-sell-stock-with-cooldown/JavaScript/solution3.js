var maxProfit = function(prices) {
    return calculateMaxProfit(prices, 0, false, 0);
};

function calculateMaxProfit(prices, day, hasStock, cooldown) {
    if (day >= prices.length) return 0;
    
    let maxProfit = 0;
    
    if (hasStock) {
        maxProfit = Math.max(
            calculateMaxProfit(prices, day + 1, false, cooldown),
            calculateMaxProfit(prices, day + 2, false, cooldown + prices[day])
        );
    } else {
        maxProfit = Math.max(
            calculateMaxProfit(prices, day + 1, true, cooldown - prices[day]),
            calculateMaxProfit(prices, day + 1, false, cooldown)
        );
    }
    
    return maxProfit;
}