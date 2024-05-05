class Solution(object):
    def maxProfit(self, prices):
        n = len(prices)
        dp = [0] * n
        for i in range(1, n):
            dp[i] = max(dp[i - 1], dp[i - 2] + prices[i] - prices[i - 1])
        return dp[-1]
