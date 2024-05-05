/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    function divideAndConquer(start, end) {
        if (start >= end) return 0;
        let profit = 0;
        for (let i = start; i < end; i++) {
            for (let j = i + 1; j <= end; j++) {
                if (prices[j] > prices[i]) {
                    let currentProfit = prices[j] - prices[i] + divideAndConquer(start, i - 1) + divideAndConquer(j + 1, end);
                    profit = Math.max(profit, currentProfit);
                }
            }
        }
        return profit;
    }

    return divideAndConquer(0, prices.length - 1);
};
