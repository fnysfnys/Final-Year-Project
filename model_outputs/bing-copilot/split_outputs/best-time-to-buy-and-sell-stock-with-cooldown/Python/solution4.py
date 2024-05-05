class Solution(object):
    def maxProfit(self, prices):
        buy, sell, cooldown = float('-inf'), 0, 0
        for price in prices:
            prev_buy, prev_sell = buy, sell
            buy = max(buy, cooldown - price)
            sell = max(sell, prev_buy + price)
            cooldown = max(cooldown, prev_sell)
        return sell
