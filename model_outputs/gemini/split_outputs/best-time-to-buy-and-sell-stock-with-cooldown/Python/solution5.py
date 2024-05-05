def maxProfit(self, prices):
  n = len(prices)
  if n < 2: return 0
  buy, sell = 0, 1
  profit = 0
  while sell < n:
    while buy < sell and prices[buy] >= prices[sell]:
      sell += 1
    if buy < sell:
      profit += prices[sell] - prices[buy]
      buy = sell + 1
      while buy < n and prices[buy] <= prices[sell - 1]:
        buy += 1
    sell += 1
  return profit
