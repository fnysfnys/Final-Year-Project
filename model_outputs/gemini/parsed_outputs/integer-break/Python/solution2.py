class Solution(object):
    def integerBreak(self, n):
      if n <= 2:
        return 1
      if n == 3:
        return 2
      result = 1
      while n > 4:
        result *= 3
        n -= 3
      if n == 4:
        result *= 2
      else:
        result *= n
      return result
    
