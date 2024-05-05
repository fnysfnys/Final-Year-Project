class Solution:
    def maxProfit(self, prices):
        profit, i = 0, 0
        while i < len(prices)-1:
            while i < len(prices)-1 and prices[i+1] <= prices[i]:
                i += 1
            buy = prices[i]
            while i < len(prices)-1 and prices[i+1] > prices[i]:
                i += 1
            sell = prices[i]
            profit += sell - buy
            i += 2  # Skip next day for cooldown
        return profit
