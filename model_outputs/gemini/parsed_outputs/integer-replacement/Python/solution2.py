class Solution(object):
    def integerReplacement(self, n):
        dp = [float('inf')] * (n + 1)
        dp[1] = 0
        for i in range(2, n + 1):
            if i % 2 == 0:
                dp[i] = 1 + dp[i // 2]
            else:
                dp[i] = 1 + min(dp[i + 1], dp[i - 1])
        return dp[n]
