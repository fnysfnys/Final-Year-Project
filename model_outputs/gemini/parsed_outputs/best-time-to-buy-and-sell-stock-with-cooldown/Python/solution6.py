class Solution(object):
    def maxProfit(self, prices):
      n = len(prices)
      if n < 2: return 0
      min_price = max_price = prices[0]
      profit = 0
      for i in range(1, n):
        min_price = min(min_price, prices[i])
        max_price = max(max_price, prices[i])
        profit = max(profit, max_price - min_price)
      return profit
    
