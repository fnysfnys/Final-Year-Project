def coinChange(coins, amount):
   # Initialize a list to store the combinations
   combinations = []

   # Iterate over the coins and calculate the combinations
   for coin in coins:
       combinations.append(amount // coin)
       amount %= coin

   # Return the minimum number of coins needed
   return min(combinations)
