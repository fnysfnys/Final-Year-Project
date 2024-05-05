class Solution(object):
    def coinChange(self, coins, amount):
        """
        [Docstring same as provided]
        """
        dp = [float('inf')] * (amount + 1)
        dp[0] = 0
        coins.sort()

        for coin in coins:
            for i in range(coin, amount + 1):
                dp[i] = min(dp[i], dp[i - coin] + 1)

        return dp[amount] if dp[amount] != float('inf') else -1