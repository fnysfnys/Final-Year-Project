/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    let buy = -Infinity, sell = 0;

    for (let i = 0; i < prices.length; i++) {
        let nextBuy = Math.max(buy, sell - prices[i]);
        sell = Math.max(sell, buy + prices[i]);
        buy = nextBuy;
    }

    return sell;
};
