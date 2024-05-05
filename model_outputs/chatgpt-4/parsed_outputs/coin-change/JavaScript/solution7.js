/**
 * ... [Docstring as provided]
 */
var coinChange = function(coins, amount) {
    function dp(n) {
        if (n < 0) return -1;
        if (n === 0) return 0;
        if (memo[n] !== undefined) return memo[n];

        let min = Infinity;
        for (let coin of coins) {
            let res = dp(n - coin);
            if (res >= 0 && res < min) {
                min = res + 1;
            }
        }

        memo[n] = (min === Infinity) ? -1 : min;
        return memo[n];
    }

    const memo = Array(amount + 1);
    return dp(amount);
};