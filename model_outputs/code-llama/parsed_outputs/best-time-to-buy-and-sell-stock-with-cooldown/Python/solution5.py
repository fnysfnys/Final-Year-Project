class Solution(object):
    def maxProfit(self, prices):
       window_size = 2
       max_profit = 0
       for i in range(len(prices) - window_size + 1):
           window_profit = prices[i+window_size-1] - prices[i]
           if window_profit > max_profit:
               max_profit = window_profit
       return max_profit
    
