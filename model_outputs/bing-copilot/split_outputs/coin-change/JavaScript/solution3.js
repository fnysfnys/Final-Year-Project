var coinChange = function(coins, amount) {
    const memo = new Map();
    const helper = (remaining) => {
        if (remaining === 0) return 0;
        if (remaining < 0) return -1;
        if (memo.has(remaining)) return memo.get(remaining);
        let minCoins = Infinity;
        for (const coin of coins) {
            const subproblem = helper(remaining - coin);
            if (subproblem !== -1) {
                minCoins = Math.min(minCoins, subproblem + 1);
            }
        }
        const result = minCoins === Infinity ? -1 : minCoins;
        memo.set(remaining, result);
        return result;
    };
    return helper(amount);
};
