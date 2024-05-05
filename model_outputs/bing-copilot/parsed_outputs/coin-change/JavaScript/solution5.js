var coinChange = function(coins, amount) {
    const backtrack = (remaining, index) => {
        if (remaining === 0) return 0;
        if (remaining < 0 || index >= coins.length) return -1;
        const useCoin = backtrack(remaining - coins[index], index);
        const skipCoin = backtrack(remaining, index + 1);
        if (useCoin === -1) return skipCoin;
        if (skipCoin === -1) return useCoin + 1;
        return Math.min(useCoin + 1, skipCoin);
    };
    return backtrack(amount, 0);
};
