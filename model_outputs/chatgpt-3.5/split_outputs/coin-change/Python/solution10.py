class Solution(object):
    def coinChange(self, coins, amount):
        """
        You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.
        Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.
        You may assume that you have an infinite number of each kind of coin.
        """
        memo = {}
        def dp(amount):
            if amount in memo:
                return memo[amount]
            if amount == 0:
                return 0
            min_coins = float('inf')
            for coin in coins:
                if amount >= coin:
                    result = dp(amount - coin)
                    if result >= 0:
                        min_coins = min(min_coins, result + 1)
            memo[amount] = -1 if min_coins == float('inf') else min_coins
            return memo[amount]
        return dp(amount)
