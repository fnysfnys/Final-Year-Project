class Solution:
    def maxProfit(self, prices):
        if not prices:
            return 0
        buy, sell, cooldown = -prices[0], 0, 0
        for price in prices[1:]:
            buy, sell, cooldown = max(buy, cooldown - price), max(sell, buy + price), max(cooldown, sell)
        return max(sell, cooldown)
