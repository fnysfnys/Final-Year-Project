def getRow(self, rowIndex):
   dp = [1] * (rowIndex + 1)
   for i in range(2, rowIndex + 1):
       dp[i] = dp[i - 1] + dp[i - 2]
   return dp
