class Solution(object):
  def canIWin(self, maxChoosableInteger, desiredTotal):
    memo = {}
    def canWin(remaining, total):
      if (remaining, total) in memo: return memo[(remaining, total)]
      if remaining == 0: return False
      for num in range(1, remaining + 1):
        if total + num >= desiredTotal or not canWin(remaining - num, total + num):
          memo[(remaining, total)] = True
          return True
      memo[(remaining, total)] = False
      return False
    return canWin(maxChoosableInteger, 0)
