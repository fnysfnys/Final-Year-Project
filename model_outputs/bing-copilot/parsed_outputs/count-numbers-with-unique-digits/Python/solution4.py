class Solution(object):
    def countNumbersWithUniqueDigits(self, n):
        dp = [1] * (n + 1)
        for i in range(1, n + 1):
            dp[i] = dp[i - 1] + 9 * dp[i - 2] if i > 1 else 10
        return dp[n]
