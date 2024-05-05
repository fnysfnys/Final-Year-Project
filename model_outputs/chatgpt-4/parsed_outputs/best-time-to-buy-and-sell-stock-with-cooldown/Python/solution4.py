class Solution:
    def maxProfit(self, prices):
        memo = {}
        def dp(i, buying):
            if i >= len(prices):
                return 0
            if (i, buying) in memo:
                return memo[(i, buying)]
            cooldown = dp(i+1, buying)
            if buying:
                buy = dp(i+1, False) - prices[i]
                memo[(i, buying)] = max(buy, cooldown)
            else:
                sell = dp(i+2, True) + prices[i]  # Next day cooldown
                memo[(i, buying)] = max(sell, cooldown)
            return memo[(i, buying)]
        return dp(0, True)
