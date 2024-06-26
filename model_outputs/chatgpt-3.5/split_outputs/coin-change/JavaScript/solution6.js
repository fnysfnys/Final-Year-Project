var coinChange = function(coins, amount) {
    const dp = new Array(amount + 1).fill(-1);
    dp[0] = 0;

    for (let i = 1; i <= amount; i++) {
        for (const coin of coins) {
            if (i - coin >= 0 && dp[i - coin] !== -1) {
                dp[i] = dp[i] === -1 ? dp[i - coin] + 1 : Math.min(dp[i], dp[i - coin] + 1);
            }
        }
    }

    return dp[amount];
};
