var coinChange = function(coins, amount) {
    const memo = new Array(amount + 1).fill(-1);

    function dp(target) {
        if (target === 0) return 0;
        if (target < 0) return -1;
        if (memo[target] !== -1) return memo[target];

        let minCoins = Infinity;
        for (const coin of coins) {
            const subproblem = dp(target - coin);
            if (subproblem !== -1) {
                minCoins = Math.min(minCoins, subproblem + 1);
            }
        }

        memo[target] = minCoins === Infinity ? -1 : minCoins;
        return memo[target];
    }

    return dp(amount);
};