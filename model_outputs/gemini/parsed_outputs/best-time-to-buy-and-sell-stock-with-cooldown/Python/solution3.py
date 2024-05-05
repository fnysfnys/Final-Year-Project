class Solution(object):
    def maxProfit(self, prices):
      profit = 0
      buy = prices[0]
      for price in prices[1:]:
        if price > buy:
          profit += price - buy
          buy = price
        else:
          buy = min(buy, price)
      return profit
    
