import numpy as np

class Solution(object):
    def maxProfit(self, prices):
      prices = np.array(prices)
      min_price = prices.cummin()
      profit = prices - min_price
      return profit.max()
    
