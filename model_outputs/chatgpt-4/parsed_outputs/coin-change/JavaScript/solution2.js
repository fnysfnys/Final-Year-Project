/**
 * ... [Docstring as provided]
 */
var coinChange = function(coins, amount) {
    const memo = {};

    function count(amount) {
        if (amount < 0) return -1;
        if (amount === 0) return 0;
        if (memo[amount]) return memo[amount];

        let min = Infinity;
        for (let coin of coins) {
            const res = count(amount - coin);
            if (res >= 0 && res < min) {
                min = 1 + res;
            }
        }

        memo[amount] = (min === Infinity) ? -1 : min;
        return memo[amount];
    }

    return count(amount);
};