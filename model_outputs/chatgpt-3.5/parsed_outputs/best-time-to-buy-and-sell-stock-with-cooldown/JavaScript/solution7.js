var maxProfit = function(prices) {
    return prices.reduce((profit, price, i) => {
        return i > 0 && price > prices[i - 1] ? profit + price - prices[i - 1] : profit;
    }, 0);
};