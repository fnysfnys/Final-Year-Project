/**
 * ... [Docstring as provided]
 */
var coinChange = function(coins, amount) {
    let result = Infinity;

    function helper(index, remaining, count) {
        if (remaining === 0) {
            result = Math.min(result, count);
            return;
        }
        if (index === coins.length) return;

        const maxAmount = Math.floor(remaining / coins[index]);
        for (let i = maxAmount; i >= 0 && count + i < result; i--) {
            helper(index + 1, remaining - i * coins[index], count + i);
        }
    }

    helper(0, amount, 0);
    return result === Infinity ? -1 : result;
};