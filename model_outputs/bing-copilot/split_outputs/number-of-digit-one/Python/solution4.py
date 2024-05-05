class Solution(object):
    def countDigitOne(self, n):
        dp = [0] * (len(str(n)) + 1)
        for i in range(len(str(n)), 0, -1):
            dp[i - 1] = dp[i] * 10 + (n // 10 ** (i - 1)) * (i - 1)
            if n // 10 ** (i - 1) % 10 == 1:
                dp[i - 1] += n % 10 ** (i - 1) + 1
        return dp[0]
