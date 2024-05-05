class Solution(object):
    def maxProfit(self, prices):
        intervals = []
        for i in range(1, len(prices)):
            intervals.append(prices[i] - prices[i - 1])
        return sum(max(0, interval) for interval in intervals)
