class Solution(object):
    def maxProfit(self, prices):
        def dfs(i, has_stock, cooldown):
            if i >= len(prices):
                return 0
            if (i, has_stock, cooldown) in memo:
                return memo[(i, has_stock, cooldown)]
            buy = -prices[i] + dfs(i + 1, True, False)
            sell = prices[i] + dfs(i + 2, False, True)
            cooldown = dfs(i + 1, False, False)
            memo[(i, has_stock, cooldown)] = max(buy, sell, cooldown)
            return memo[(i, has_stock, cooldown)]

        memo = {}
        return dfs(0, False, False)
