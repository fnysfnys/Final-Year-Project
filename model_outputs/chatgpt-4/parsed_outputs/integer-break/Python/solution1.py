class Solution(object):
    def integerBreak(self, n):
        """
        (Docstring as provided)
        """
        if n <= 3:
            return n - 1
        dp = [0] * (n + 1)
        dp[1], dp[2], dp[3] = 1, 2, 3
        for i in range(4, n + 1):
            dp[i] = max(dp[i - 2] * 2, dp[i - 3] * 3)
        return dp[n]