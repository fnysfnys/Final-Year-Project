class Solution(object):
    def numDistinct(self, s, t):
        """
        Given two strings s and t, return the number of distinct subsequences of s which equals t.
        The test cases are generated so that the answer fits on a 32-bit signed integer.
        ...
        """
        if not t:
            return 1
        if not s:
            return 0
        if s[-1] == t[-1]:
            return self.numDistinct(s[:-1], t[:-1]) + self.numDistinct(s[:-1], t)
        else:
            return self.numDistinct(s[:-1], t)
