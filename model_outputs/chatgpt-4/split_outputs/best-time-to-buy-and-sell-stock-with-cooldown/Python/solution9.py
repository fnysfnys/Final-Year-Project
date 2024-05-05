class Solution:
    def maxProfit(self, prices):
        def dfs(index, canBuy):
            if index >= len(prices):
                return 0
            if canBuy:
                return max(-prices[index] + dfs(index + 1, False), dfs(index + 1, True))
            else:
                return max(prices[index] + dfs(index + 2, True), dfs(index + 1, False))
        return dfs(0, True)
