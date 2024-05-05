def maxProfit(prices):
   left, right = 0, 1
   max_profit = 0
   while right < len(prices):
       if prices[right] > prices[left]:
           max_profit += prices[right] - prices[left]
       left, right = right, right + 1
   return max_profit
