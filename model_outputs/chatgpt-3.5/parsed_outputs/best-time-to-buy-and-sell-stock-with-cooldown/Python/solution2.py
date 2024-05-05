class Solution(object):
    def maxProfit(self, prices):
        n = len(prices)
        buy = [0] * n
        sell = [0] * n
        cooldown = [0] * n

        buy[0] = -prices[0]

        for i in range(1, n):
            cooldown[i] = max(cooldown[i - 1], sell[i - 1])
            buy[i] = max(buy[i - 1], cooldown[i - 1] - prices[i])
            sell[i] = buy[i - 1] + prices[i]

        return max(sell[-1], cooldown[-1])