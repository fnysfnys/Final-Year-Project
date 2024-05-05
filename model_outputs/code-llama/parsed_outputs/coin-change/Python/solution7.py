class Solution(object):
    def coinChange(self, coins, amount):
       # Initialize a list to store the number of coins needed
       dp = [0] * (amount + 1)
    
       # Iterate over the coins and calculate the number of coins needed
       for coin in coins:
           for i in range(coin, amount + 1):
               dp[i] = max(dp[i], dp[i - coin] + 1)
    
       # Return the number of coins needed
       return dp[amount]
    
