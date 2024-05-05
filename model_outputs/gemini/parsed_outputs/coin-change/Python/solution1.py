class Solution(object):
    def coinChange(self, coins, amount):
        if amount == 0:
            return 0
        if not coins:
            return -1
        minCoins = float('inf')
        for coin in coins:
            if coin <= amount:
                result = self.coinChange(coins, amount - coin)
                if result != -1:
                    minCoins = min(minCoins, result + 1)
        return -1 if minCoins == float('inf') else minCoins
    
