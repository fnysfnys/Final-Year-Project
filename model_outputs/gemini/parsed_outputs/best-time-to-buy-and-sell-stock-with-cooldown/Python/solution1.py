class Solution(object):
    def maxProfit(self, prices):
      n = len(prices)
      if n < 2: return 0
      buy, sell, cooldown = float('-inf'), 0, float('-inf')
      for price in prices:
        buy = max(buy, cooldown - price)
        cooldown = sell
        sell = max(sell, price + buy)
      return sell
    
