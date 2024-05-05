class Solution(object):
    def canCross(self, stones):
       dp = [True] * len(stones)
       for i in range(1, len(stones)):
           if stones[i] - stones[i-1] > 1:
               dp[i] = False
           else:
               dp[i] = dp[i-1]
       return dp[-1]
    
