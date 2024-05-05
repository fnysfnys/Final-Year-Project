class Solution(object):
    def maxProfit(self, prices):
        max_profit = 0
        valley = prices[0]

        for i in range(1, len(prices)):
            if prices[i] < prices[i - 1]:
                valley = prices[i]
            elif prices[i] >= prices[i - 1] and (i == len(prices) - 1 or prices[i] > prices[i + 1]):
                max_profit += prices[i] - valley

        return max_profit