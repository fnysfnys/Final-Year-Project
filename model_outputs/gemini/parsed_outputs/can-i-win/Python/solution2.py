class Solution(object):
  def canIWin(self, maxChoosableInteger, desiredTotal):
    dp = [[False] * (desiredTotal + 1) for _ in range(maxChoosableInteger + 1)]
    for i in range(1, maxChoosableInteger + 1):
      for j in range(desiredTotal + 1):
        for num in range(1, i + 1):
          if num >= j or not dp[i - num][j - num]:
            dp[i][j] = True
            break
    return dp[maxChoosableInteger][desiredTotal]
