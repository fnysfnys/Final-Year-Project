class Solution(object):
    def coinChange(self, coins, amount):
        def backtrack(remaining, index):
            if remaining == 0:
                return 0
            if remaining < 0 or index >= len(coins):
                return float('inf')
            use_coin = backtrack(remaining - coins[index], index)
            skip_coin = backtrack(remaining, index + 1)
            return min(use_coin, skip_coin) + 1
        result = backtrack(amount, 0)
        return result if result != float('inf') else -1
