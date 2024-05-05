class Solution(object):
    def integerBreak(self, n):
        """
        (Docstring as provided)
        """
        dp = [0, 1, 1] + [0] * (n - 2)
        for i in range(3, n + 1):
            for j in range(1, i // 2 + 1):
                dp[i] = max(dp[i], max(j, dp[j]) * max(i - j, dp[i - j]))
        return dp[n]
