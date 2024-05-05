class Solution(object):
  def canIWin(self, maxChoosableInteger, desiredTotal):
    def backtrack(mask, total):
      if total >= desiredTotal: return True
      for i in range(maxChoosableInteger):
        if not (mask & (1 << i)):
          new_mask = mask | (1 << i)
          if not backtrack(new_mask, total + i + 1): return True
      return False
    return backtrack(0, 0)
