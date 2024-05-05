var coinChange = function(coins, amount) {
    coins.sort((a, b) => a - b);
    const binarySearch = (target) => {
        let left = 0;
        let right = coins.length - 1;
        while (left <= right) {
            const mid = Math.floor((left + right) / 2);
            if (coins[mid] === target) return 1;
            if (coins[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    };
    const dp = Array(amount + 1).fill(Infinity);
    dp[0] = 0;
    for (let i = 1; i <= amount; i++) {
        for (const coin of coins) {
            if (i >= coin) {
                dp[i] = Math.min(dp[i], binarySearch(i - coin) + 1);
            }
        }
    }
    return dp[amount] === Infinity ? -1 : dp[amount];
};
