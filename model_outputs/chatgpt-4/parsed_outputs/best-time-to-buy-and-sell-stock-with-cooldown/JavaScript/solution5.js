/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    let buy = -prices[0], prevBuy, sell = 0, prevSell = 0;

    for (let price of prices) {
        prevBuy = buy;
        buy = Math.max(prevSell -

price, prevBuy);
        prevSell = sell;
        sell = Math.max(prevBuy + price, prevSell);
    }

    return sell;
};