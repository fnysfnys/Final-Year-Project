class Solution(object):
    def numDistinct(self, s, t):
        """
        Given two strings s and t, return the number of distinct subsequences of s which equals t.
        The test cases are generated so that the answer fits on a 32-bit signed integer.
        ...
        """
        m, n = len(s), len(t)
        dp = [0] * (n + 1)
        dp[0] = 1

        for i in range(1, m + 1):
            for j in range(n, 0, -1):
                if s[i - 1] == t[j - 1]:
                    dp[j] += dp[j - 1]

        return dp[n]
