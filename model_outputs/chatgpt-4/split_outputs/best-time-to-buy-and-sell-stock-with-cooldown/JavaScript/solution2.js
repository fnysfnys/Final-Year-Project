/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    let hold = -Infinity, sold = 0, rest = 0;

    for (let price of prices) {
        let prevSold = sold;
        sold = hold + price;
        hold = Math.max(hold, rest - price);
        rest = Math.max(rest, prevSold);
    }

    return Math.max(sold, rest);
};
