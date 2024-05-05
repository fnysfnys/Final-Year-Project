class Solution(object):
    def maxProfit(self, prices):
       if len(prices) == 1:
           return 0
       mid = len(prices) // 2
       left_profit = self.maxProfit(prices[:mid])
       right_profit = self.maxProfit(prices[mid:])
       return max(left_profit, right_profit)
    
