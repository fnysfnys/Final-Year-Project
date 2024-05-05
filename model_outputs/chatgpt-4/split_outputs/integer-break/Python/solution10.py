class Solution(object):
    def integerBreak(self, n):
        """
        (Docstring as provided)
        """
        dp = [0, 1, 1, 2] + [0] * (n - 3)
        for i in range(4, n + 1):
            dp[i] = max(2 * dp[i - 2], 3 * dp[i - 3])
        return dp[n]
