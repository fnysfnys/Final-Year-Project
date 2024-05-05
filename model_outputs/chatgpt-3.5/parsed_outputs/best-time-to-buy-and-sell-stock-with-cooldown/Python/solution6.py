class Solution(object):
    def maxProfit(self, prices):
        stack = []
        max_profit = 0

        for price in prices:
            while stack and price > stack[-1]:
                max_profit += price - stack.pop()
            stack.append(price)

        return max_profit