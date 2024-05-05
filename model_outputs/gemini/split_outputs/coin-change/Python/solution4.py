def coinChange(coins, amount):
    dp = [-1] * (amount + 1)
    dp[0] = 0
    def helper(target):
        if target < 0 or dp[target] != -1:
            return dp[target]
        minCoins = float('inf')
        for coin in coins:
            result = helper(target - coin)
            if result != -1:
                minCoins = min(minCoins, result + 1)
        dp[target] = minCoins
        return dp[target]
    return helper(amount)
