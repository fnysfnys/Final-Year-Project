class Solution(object):
  def canIWin(self, maxChoosableInteger, desiredTotal):
    visited = set()
    def canWin(remaining, total):
      if (remaining, total) in visited: return False
      visited.add((remaining, total))
      if remaining == 0: return False
      for num in range(1, remaining + 1):
        if total + num >= desiredTotal or not canWin(remaining - num, total + num):
          return True
      return False
    return canWin(maxChoosableInteger, 0)
