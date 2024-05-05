class Solution(object):
    def maxProfit(self, prices):
       memo = {}
       def helper(i):
           if i == len(prices):
               return 0
           if i in memo:
               return memo[i]
           profit = prices[i] - prices[i-1]
           memo[i] = profit
           return profit
       return helper(len(prices)-1)
    
