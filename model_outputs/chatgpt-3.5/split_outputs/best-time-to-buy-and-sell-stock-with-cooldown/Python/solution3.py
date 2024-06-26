class Solution(object):
    def maxProfit(self, prices):
        n = len(prices)
        if n <= 1:
            return 0

        profit = 0
        for i in range(1, n):
            if prices[i] > prices[i - 1]:
                profit += prices[i] - prices[i - 1]

        return profit
