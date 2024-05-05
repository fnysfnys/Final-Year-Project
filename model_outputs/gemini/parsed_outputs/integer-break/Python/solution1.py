class Solution(object):
    def integerBreak(self, n):
      dp = [0] * (n + 1)
      dp[1] = 1
      for i in range(2, n + 1):
        for j in range(1, i // 2 + 1):
          dp[i] = max(dp[i], max(j * dp[i - j], j * (i - j)))
      return dp[n]
    
