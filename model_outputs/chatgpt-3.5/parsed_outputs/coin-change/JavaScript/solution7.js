var coinChange = function(coins, amount) {
    const dp = Array.from({ length: coins.length + 1 }, () => Array(amount + 1).fill(Infinity));
    
    for (let i = 0; i <= coins.length; i++) {
        dp[i][0] = 0;
    }

    for (let i = 1; i <= coins.length; i++) {
        for (let j = 1; j <= amount; j++) {
            if (j - coins[i - 1] >= 0) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - coins[i - 1]] + 1);
            } else {
                dp[i][j] = dp[i - 1][j];
            }
        }
    }

    return dp[coins.length][amount] === Infinity ? -1 : dp[coins.length][amount];
};