/**
 * ... [Docstring as provided]
 */
var coinChange = function(coins, amount) {
    coins.sort((a, b) => b - a);
    let result = Infinity;

    function find(index, remaining, count) {
        const coin = coins[index];
        if (index === coins.length - 1) {
            if (remaining % coin === 0) {
                result = Math.min(result, count + Math.floor(remaining / coin));
            }
            return;
        }

        for (let k = Math.floor(remaining / coin); k >= 0 && count + k < result; k--) {
            find(index + 1, remaining - k * coin, count + k);
        }
    }

    find(0, amount, 0);
    return result === Infinity ? -1 : result;
};
