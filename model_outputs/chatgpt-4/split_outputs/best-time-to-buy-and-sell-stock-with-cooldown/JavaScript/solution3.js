/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    const memo = new Map();

    function dp(index, canBuy) {
        if (index >= prices.length) return 0;
        if (memo.has(`${index}-${canBuy}`)) return memo.get(`${index}-${canBuy}`);

        if (canBuy) {
            let buy = dp(index + 1, false) - prices[index];
            let cooldown = dp(index + 1, true);
            memo.set(`${index}-${canBuy}`, Math.max(buy, cooldown));
        } else {
            let sell = dp(index + 2, true) + prices[index];
            let cooldown = dp(index + 1, false);
            memo.set(`${index}-${canBuy}`, Math.max(sell, cooldown));
        }

        return memo.get(`${index}-${canBuy}`);
    }

    return dp(0, true);
};
