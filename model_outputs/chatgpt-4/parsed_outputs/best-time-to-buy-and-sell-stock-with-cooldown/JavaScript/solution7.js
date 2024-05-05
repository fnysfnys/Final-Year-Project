/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    function calculateProfit(index, canBuy) {
        if (index >= prices.length) return 0;

        if (canBuy) {
            let buy = calculateProfit(index + 1, false) - prices[index];
            let cooldown = calculateProfit(index + 1, true);
            return Math.max(buy, cooldown);
        } else {
            let sell = calculateProfit(index + 2, true) + prices[index];
            let cooldown = calculateProfit(index + 1, false);
            return Math.max(sell, cooldown);
        }
    }

    return calculateProfit(0, true);
};