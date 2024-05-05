class Solution(object):
    def countDigitOne(self, n):
      dp = [0] * (n + 1)
      for i in range(1, n + 1):
        dp[i] = (dp[i // 10] + (i % 10 == 1)) * 10 + (i % 10 > 1)
      return dp[n]
    
