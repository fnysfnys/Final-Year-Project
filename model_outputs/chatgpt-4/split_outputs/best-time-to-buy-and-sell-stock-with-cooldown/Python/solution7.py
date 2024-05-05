class Solution:
    def maxProfit(self, prices):
        if not prices:
            return 0
        n = len(prices)
        buy = -prices[0]
        sell = 0
        cooldown = 0
        for i in range(1, n):
           

 prev_buy = buy
            buy = max(buy, cooldown - prices[i])
            cooldown = max(cooldown, sell)
            sell = max(sell, prev_buy + prices[i])
        return max(sell, cooldown)
