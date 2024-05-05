def maxProfit(self, prices, i, buy, sell, cooldown):
  if i >= len(prices): return 0
  if buy != float('-inf') and sell != float('-inf'): return sell
  profit_buy = self.maxProfit(prices, i+1, buy, min(sell, prices[i]), cooldown)
  profit_cooldown = self.maxProfit(prices, i+1, float('-inf'), sell, buy)
  return max(profit_buy, profit_cooldown)

def maxProfitWrapper(self, prices):
  return self.maxProfit(prices, 0, float('-inf'), float('-inf'), float('-inf'))
