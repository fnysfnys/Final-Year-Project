class Solution(object):
    def numDistinct(self, s, t):
        def helper(i, j, remaining):
            if not remaining:
                return 1
            if i == len(s) or j == len(t):
                return 0
            return helper(i + 1, j, remaining) + (helper(i + 1, j + 1, remaining - 1) if s[i] == t[j] else 0)
    
        return helper(0, 0, len(t))
    
