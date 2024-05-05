/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    if (prices.length <= 1) return 0;

    let noStock = 0, inHand = -prices[0], sold = 0;
    for (let i = 1; i < prices.length; i++) {
        let temp = noStock;
        noStock = Math.max(noStock, sold);
        sold = inHand + prices[i];
        inHand = Math.max(inHand, temp - prices[i]);
    }

    return Math.max(noStock, sold);
};
