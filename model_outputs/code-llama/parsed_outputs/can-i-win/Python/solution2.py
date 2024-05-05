class Solution(object):
    def canIWin(self, maxChoosableInteger, desiredTotal):
       dp = [False] * (maxChoosableInteger + 1)
       dp[0] = True
       for i in range(1, maxChoosableInteger + 1):
           for j in range(1, maxChoosableInteger + 1):
               if j >= i:
                   dp[j] = dp[j] or dp[j - i]
       return dp[desiredTotal]
    
