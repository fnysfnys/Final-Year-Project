class Solution:
    def maxProfit(self, prices):
        if not prices:
            return 0
        n = len(prices)
        buy, sell, cooldown = [0] * n, [0] * n, [0] * n
        buy[0] = -prices[0]
        for i in range(1, n):
            buy[i] = max(buy[i-1], cooldown[i-1] - prices[i])
            sell[i] = max(sell[i-1], buy[i-1] + prices[i])
            cooldown[i] = max(cooldown[i-1], sell[i-1])
        return max(sell[-1], cooldown[-1])
