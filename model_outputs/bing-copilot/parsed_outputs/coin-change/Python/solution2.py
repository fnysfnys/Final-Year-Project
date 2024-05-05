class Solution(object):
    def coinChange(self, coins, amount):
        memo = {}
        def dfs(remaining):
            if remaining == 0:
                return 0
            if remaining < 0:
                return float('inf')
            if remaining in memo:
                return memo[remaining]
            min_coins = float('inf')
            for coin in coins:
                min_coins = min(min_coins, dfs(remaining - coin) + 1)
            memo[remaining] = min_coins
            return min_coins
        result = dfs(amount)
        return result if result != float('inf') else -1
