class Solution(object):
    def maxProfit(self, prices):
       dp = [0] * len(prices)
       for i in range(len(prices)):
           dp[i] = max(dp[i-1], prices[i] - prices[i-1])
       return dp[-1]
    
