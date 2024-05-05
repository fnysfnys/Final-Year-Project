class Solution(object):
    def numDistinct(self, s, t):
        """
        Given two strings s and t, return the number of distinct subsequences of s which equals t.
        The test cases are generated so that the answer fits on a 32-bit signed integer.
        ...
        """
        memo = {}
        
        def dp(i, j):
            if j == len(t):
                return 1
            if i == len(s):
                return 0
            if (i, j) in memo:
                return memo[(i, j)]
            
            if s[i] == t[j]:
                memo[(i, j)] = dp(i + 1, j + 1) + dp(i + 1, j)
            else:
                memo[(i, j)] = dp(i + 1, j)
            
            return memo[(i, j)]
        
        return dp(0, 0)
