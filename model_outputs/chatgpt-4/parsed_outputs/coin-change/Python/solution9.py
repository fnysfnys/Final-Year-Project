class Solution(object):
    def coinChange(self, coins, amount):
        """
        [Docstring same as provided]
        """
        min_coins = [0] + [float('inf')] * amount

        for coin in coins:
            for i in range(coin, amount + 1):
                min_coins[i] = min(min_coins[i], min_coins[i - coin] + 1)

        return min_coins[amount] if min_coins[amount] != float('inf') else -1