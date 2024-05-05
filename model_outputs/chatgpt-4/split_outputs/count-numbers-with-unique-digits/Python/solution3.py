class Solution(object):
    def countNumbersWithUniqueDigits(self, n):
        """
        [Same docstring as provided]
        """
        if n == 0: return 1
        dp = [0] * (n + 1)
        dp[0], dp[1] = 1, 10
        for i in range(2, n + 1):
            dp[i] = dp[i - 1] + (dp[i - 1] - dp[i - 2]) * (10 - (i - 1))
        return dp[n]
