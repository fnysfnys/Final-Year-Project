class Solution(object):
    def coinChange(self, coins, amount):
        """
        You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.
        Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.
        You may assume that you have an infinite number of each kind of coin.
        """
        coins.sort(reverse=True)
        num_coins = 0
        for coin in coins:
            while amount >= coin:
                amount -= coin
                num_coins += 1
        return num_coins if amount == 0 else -1
