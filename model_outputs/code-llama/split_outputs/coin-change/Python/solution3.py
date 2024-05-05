def coinChange(coins, amount):
   # Initialize a list to store the coins
   coins_used = []

   # Iterate over the coins and use the largest coin possible
   for coin in sorted(coins, reverse=True):
       while amount >= coin:
           coins_used.append(coin)
           amount -= coin

   # Return the number of coins used
   return len(coins_used)
