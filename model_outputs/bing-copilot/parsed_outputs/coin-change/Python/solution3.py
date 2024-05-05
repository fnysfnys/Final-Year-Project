class Solution(object):
    def coinChange(self, coins, amount):
        coins.sort(reverse=True)
        count = 0
        for coin in coins:
            while amount >= coin:
                amount -= coin
                count += 1
        return count if amount == 0 else -1
