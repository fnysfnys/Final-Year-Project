class Solution(object):
    def numDistinct(self, s, t):
        dp = {}
    
        def helper(i, j):
            if (i, j) in dp:
                return dp[(i, j)]
            if j == 0:
                return 1
            if i == 0:
                return 0
            dp[(i, j)] = helper(i - 1, j) + (helper(i - 1, j - 1) if s[i - 1] == t[j - 1] else 0)
            return dp[(i, j)]
    
        return helper(len(s), len(t))
    
