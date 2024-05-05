class Solution(object):
    def maxProfit(self, prices):
       max_profit = 0
       for i in range(len(prices)):
           if prices[i] > prices[i-1]:
               max_profit += prices[i] - prices[i-1]
       return max_profit
    
