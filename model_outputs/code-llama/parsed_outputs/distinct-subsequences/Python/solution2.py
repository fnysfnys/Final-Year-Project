class Solution(object):
    def numDistinct(self, s, t):
       dp = [0] * (len(s) + 1)
       for i in range(len(s)):
           for j in range(i, len(s)):
               if s[i:j+1] == t:
                   dp[j+1] = dp[j] + 1
       return dp[len(s)]
    
