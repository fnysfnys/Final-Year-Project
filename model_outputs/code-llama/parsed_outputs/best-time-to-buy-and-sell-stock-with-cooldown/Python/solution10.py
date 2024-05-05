class Solution(object):
    def maxProfit(self, prices):
       def helper(i, j):
           if i == len(prices):
               return 0
           if j == len(prices):
               return 0
           profit = prices[j] - prices[i]
           if profit > 0:
               return profit
           return helper(i+1, j+1)
       return helper(0, 1)
    
