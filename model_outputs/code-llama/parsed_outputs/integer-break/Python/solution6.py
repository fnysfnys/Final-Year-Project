class Solution(object):
    def integerBreak(self, n):
       dp = [0] * (n+1)
       dp[1] = 1
       for i in range(2, n+1):
           dp[i] = max(dp[i-1] * dp[i-2], dp[i-1] + dp[i-2])
       return (n * (n + 1)) // 2
    
