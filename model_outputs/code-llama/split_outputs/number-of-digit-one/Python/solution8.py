def countDigitOne(n):
   dp = [0] * (n+1)
   for i in range(n+1):
       if str(i).count('1') > 0:
           dp[i] = 1
       else:
           dp[i] = 0
   for i in range(n+1):
       if str(i).count('1') > 0:
           dp[i] += dp[i-1]
   return dp[n]
