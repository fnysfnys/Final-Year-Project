def maxProfit(prices):
   if len(prices) == 1:
       return 0
   mid = len(prices) // 2
   left_profit = maxProfit(prices[:mid])
   right_profit = maxProfit(prices[mid:])
   return max(left_profit, right_profit)
