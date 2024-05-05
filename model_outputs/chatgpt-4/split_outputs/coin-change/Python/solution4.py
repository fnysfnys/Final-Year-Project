class Solution(object):
    def coinChange(self, coins, amount):
        """
        [Docstring same as provided]
        """
        if amount == 0:
            return 0

        dp = [amount + 1] * (amount + 1)
        dp[0] = 0

        for a in range(1, amount + 1):
            for coin in coins:
                if a - coin >= 0:
                    dp[a] = min(dp[a], 1 + dp[a - coin])
            if dp[a] > amount:
                return -1

        return dp[amount] if dp[amount] <= amount else -1
