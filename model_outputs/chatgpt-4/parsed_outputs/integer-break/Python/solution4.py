class Solution(object):
    def integerBreak(self, n):
        """
        (Docstring as provided)
        """
        dp = [0] * (n + 1)
        for i in range(2, n + 1):
            for j in range(1, i):
                dp[i] = max(dp[i], max(j * (i - j), j * dp[i - j]))
        return dp[n]