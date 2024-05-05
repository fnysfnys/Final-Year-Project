class Solution(object):
    def coinChange(self, coins, amount):
        """
        You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.
        Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.
        You may assume that you have an infinite number of each kind of coin.
        """
        if amount == 0:
            return 0
        if amount < 0:
            return -1
        min_coins = float('inf')
        for coin in coins:
            result = self.coinChange(coins, amount - coin)
            if result >= 0:
                min_coins = min(min_coins, result + 1)
        return -1 if min_coins == float('inf') else min_coins