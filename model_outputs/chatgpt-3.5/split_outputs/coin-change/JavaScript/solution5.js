var coinChange = function(coins, amount) {
    function dp(target) {
        if (target === 0) return 0;
        if (target < 0) return -1;

        let minCoins = Infinity;
        for (const coin of coins) {
            const subproblem = dp(target - coin);
            if (subproblem !== -1) {
                minCoins = Math.min(minCoins, subproblem + 1);
            }
        }

        return minCoins === Infinity ? -1 : minCoins;
    }

    return dp(amount);
};
