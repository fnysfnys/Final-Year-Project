class Solution(object):
    def coinChange(self, coins, amount):
       # Initialize a dictionary to store the number of coins needed
       dp = {0: 0}
    
       # Iterate over the coins and calculate the number of coins needed
       for coin in coins:
           for i in range(coin, amount + 1):
               dp[i] = min(dp[i], dp[i - coin] + 1)
    
       # Return the number of coins needed
       return dp[amount]
    
