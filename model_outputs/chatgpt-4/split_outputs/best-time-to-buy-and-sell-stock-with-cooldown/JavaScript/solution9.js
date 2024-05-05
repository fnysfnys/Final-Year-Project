/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    let stack = [], profit = 0;

    for (let price of prices) {
        while (stack.length && price > stack[stack.length - 1]) {
            profit += price - stack.pop();
        }
        stack.push(price);
    }

    return profit;
};
