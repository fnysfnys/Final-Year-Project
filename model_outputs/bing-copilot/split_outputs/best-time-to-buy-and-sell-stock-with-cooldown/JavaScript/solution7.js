var maxProfit = function(prices) {
    return prices.reduce((profit, price, i) => {
        return profit + Math.max(0, price - prices[i - 1]);
    }, 0);
};
