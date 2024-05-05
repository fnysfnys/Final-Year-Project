class Solution:
    def maxProfit(self, prices):
        hold, sold, rest = float('-inf'), 0, 0
        for price in prices:
            hold, sold, rest = max(hold, rest - price), hold + price, max(rest, sold)
        return max(sold, rest)
