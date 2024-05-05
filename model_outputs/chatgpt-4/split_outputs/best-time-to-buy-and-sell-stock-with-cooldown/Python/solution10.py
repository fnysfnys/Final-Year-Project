class Solution:
    def maxProfit(self, prices):
        def maxProfitHelper(index, state):
            if index >= len(prices):
                return 0
            # State 0: Hold, 1: Sold, 2: Cooldown
            if state == 0:
                return max(-prices[index] + maxProfitHelper(index + 1, 1), maxProfitHelper(index + 1, 0))
            elif state == 1:
                return max(prices[index] + maxProfitHelper(index + 1, 2), maxProfitHelper(index + 1, 1))
            else:
                return maxProfitHelper(index + 1, 0)
        return maxProfitHelper(0, 2)
