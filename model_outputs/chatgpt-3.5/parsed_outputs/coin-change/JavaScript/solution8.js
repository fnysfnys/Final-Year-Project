var coinChange = function(coins, amount) {
    const memo = new Map();

    function dp(target) {
        if (target === 0) return 0;
        if (target < 0) return -1;
        if (memo.has(target)) return memo.get(target);

        let minCoins = Infinity;
        for (const coin of coins) {
            const subproblem = dp(target - coin);
            if (subproblem !== -1) {
                minCoins = Math.min(minCoins, subproblem + 1);
            }
        }

        memo.set(target, minCoins === Infinity ? -1 : minCoins);
        return memo.get(target);
    }

    return dp(amount);
};